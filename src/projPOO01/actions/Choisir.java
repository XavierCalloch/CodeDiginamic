package projPOO01.actions;

import java.util.List;

import projPOO01.Controles.Controles;
import projPOO01.Exceptions.ExceptionInt;
import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.IFournisseur;
import projPOO01.Menu.Menus;

/** Classe permettant de choisir et d'afficher des IClient et des IFournisseur
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Choisir {
	/**
	 * Methode permettant d'afficher et de choisir un IClient
	 * @param listc liste de IClient
	 * @return IClient choisi par l'utilisateur
	 */
	public static IClient ChoisirIClient(List<IClient> listc) {
		System.out.println("choix du client :");
		String choix = null;
		boolean erreurint = true;
		for(IClient c:listc) {
			
			System.out.println("Taper : " +listc.indexOf(c)+ " pour choisir : " + c.toString() );
		}
		
		 erreurint=true;
		while(erreurint) {
			try {
				choix = Menus.sc.next();
				Controles.CtrlInt(choix);
				erreurint=false;
				
			}catch(ExceptionInt e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		IClient c = listc.get(Integer.parseInt(choix));
		
		return c;
	}
	
	/** Methode permettant d'afficher et de choisir un IFournisseur
	 * @param listf liste de IFournisseur
	 * @return IFournisseur choisi par l'utilisateur
	 */
	public static IFournisseur ChoisirIFournisseur(List<IFournisseur> listf) {
		System.out.println("choix du fournisseur :");
		String choix = null;
		boolean erreurint = true;
		for(IFournisseur f:listf) {
			
			System.out.println("Taper : " +listf.indexOf(f)+ " pour choisir : " + f.toString() );
		}
		
		 erreurint=true;
		while(erreurint) {
			try {
				choix = Menus.sc.next();
				Controles.CtrlInt(choix);
				erreurint=false;
				
			}catch(ExceptionInt e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		IFournisseur f = listf.get(Integer.parseInt(choix));
		
		return f;
	}
}
