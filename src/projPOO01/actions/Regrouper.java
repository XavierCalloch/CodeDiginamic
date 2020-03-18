package projPOO01.actions;

import java.util.ArrayList;
import java.util.List;

import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.IFournisseur;
import projPOO01.GestionPersonnes.Personne;
import projPOO01.affichages.Affichages;

/** Classe permettant de regrouper les IClient et les IFournisseur
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Regrouper {
	
	/** liste de clients */
	public static List<IClient> listeclient = new ArrayList<IClient>();
	/** liste de fournisseurs */
	public static List<IFournisseur> listifournisseur = new ArrayList<IFournisseur>();

	/**
	 * M�thode permettant de regrouper les IClient 
	 * 
	 * @return List<IClient>  pour qui isClient() est vrai
	 */
	public static void RegrouperIClient() {
		List<IClient> list = new ArrayList<IClient>();
		ArrayList<Personne> plist = new ArrayList<Personne>();
		plist= Affichages.GrouperAffichage();
		listeclient.clear();
		for(Personne p: plist) {
			if(p instanceof IClient)  {
				list.add((IClient)p);
			}
		}
		
		for(IClient c:list) {
			if(c.isClient()) {
				listeclient.add(c);
			}
		}
		
	}
	
	/**
	 * M�thode permettant de regrouper les IFournisseur
	 * @return List<IFournisseur>  pour qui isFournisseur() est vrai
	 */
	public static void RegrouperIFournisseur() {
		List<IFournisseur> list = new ArrayList<IFournisseur>();
		ArrayList<Personne> plist = new ArrayList<Personne>();
		plist= Affichages.GrouperAffichage();
		listifournisseur.clear();
		for(Personne p: plist) {
			if(p instanceof IFournisseur)  {
				list.add((IFournisseur)p);
			}
		}
		
		for(IFournisseur f:list) {
			if(f.isFournisseur()) {
				listifournisseur.add(f);
			}
		}
		
	}

}
