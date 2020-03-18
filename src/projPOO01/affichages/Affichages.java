package projPOO01.affichages;

import java.util.ArrayList;

import projPOO01.Programme;
import projPOO01.GestionPersonnes.Personne;
import projPOO01.Menu.Menus;
import projPOO01.saisie.Saisir;

/** Classe permettant d'afficher toutes les donn�es de l'entrepise et notamment les salari�s,
 * les clients, les fournisseurs et le patron
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Affichages {

	/**
	 * M�thode qui affiche les donn�es de l'entrepise
	 */
	public static void Afficher() {
		
		
		
		int choix;
		ArrayList<Personne> listpatron = new ArrayList<Personne>();
		listpatron.add(Saisir.patron);
		
		System.out.println("Taper 1 pour afficher toutes les donn�es");
		System.out.println("Taper 2 pour afficher les salari�s");
		System.out.println("Taper 3 pour afficher les clients");
		System.out.println("Taper 4 pour afficher les fournisseur");
		System.out.println("Taper 5 pour afficher le patron");
		System.out.println("Taper 6 pour retourner au menu");
		
		choix=Menus.sc.nextInt();
		
		switch(choix) {
		case 1 : AfficherCommun(Affichages.GrouperAffichage());
		break;
		case 2 : AfficherCommun(Saisir.listsalarie);
		break;
		case 3 : AfficherCommun(Saisir.listclient);
		break;
		case 4 : AfficherCommun(Saisir.listfournisseur);
		break;
		case 5 : AfficherCommun(listpatron);
		break;
		case 6 : Menus.Menu();
		break;
		default : Afficher();
		break;
		}
	}
	
	
	/** M�thode qui affiche les personnes d'une liste de personnes donn�e
	 * @param list
	 */
	public static void AfficherCommun(ArrayList<Personne> list ) {
		for(Personne p:list) {
			System.out.println(p.toString());
		}
		//Menus.RetourMenu();
	}
	
	/** M�thode qui groupe l'affichage des personnes d'une liste donn�e
	 * @return ArrayList<Personne> la liste de personnes
	 */
	public static ArrayList<Personne> GrouperAffichage() {
		ArrayList<Personne> list = new ArrayList<Personne>();
		list.addAll(Saisir.listsalarie);
		list.addAll(Saisir.listclient);
		list.addAll(Saisir.listfournisseur);
		list.add(Saisir.patron);
		
		return list;
	}
	
}
