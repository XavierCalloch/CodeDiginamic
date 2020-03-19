package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.commande;

public interface IFournisseur {
	/**
	 * @return false par d�faut
	 */
	default public boolean livre() {
		return false;
	}
	
	public void commande(List<commande> listcommande);
	
	/**
	 * @return true par d�faut
	 */
	default public boolean isFournisseur() {
		return true;
	}
}
