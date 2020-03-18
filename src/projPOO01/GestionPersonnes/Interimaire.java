package projPOO01.GestionPersonnes;

import projPOO01.Exceptions.ExceptionSaisiNumeroSecu;

/** Repr�sente un int�rimaire
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Interimaire extends Salarie {
	
	/** contrat de l'agence de l'int�rimaire */
	private String contratAgence;
	
	/** dur�e du contrat en mois */
	private int duree;
	
	/** Constructeur
	 * @param nom			nom de l'int�rimaire
	 * @param prenom		pr�nom de l'int�rimaire
	 * @param adresse		adresse de l'int�rimaire
	 * @param ville			ville de l'int�rimaire
	 * @param codepostal	code postal de l'int�rimaire
	 * @param secu			num�ro de s�curit� sociale de l'int�rimaire
	 * @param salaire		salaire de l'int�rimaire
	 * @param contratAgence	contrat de l'agence de l'int�rimaire
	 * @param duree			dur�e du contrat en mois
	 */
	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu, double salaire, String contratAgence, int duree) {
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		this.contratAgence = contratAgence;
		this.duree = duree;
	}
	
	/** M�thode qui retourne une exception si l'on saisit moins de 5 caract�res dans le contrat
	 * de l'agence de l'int�rimaire
	 * @param contratAgence contrat de l'agence de l'int�rimaire
	 * @throws Exception
	 */
	public static void CtrlSaisiContratAgence(String contrat) throws Exception{
		if(contrat.length() < 5) {
			throw new Exception("Veuillez saisir au moins 5 caract�res dans le contrat");
		}
	}
	
	/** M�thode qui retourne une exception si l'on saisit un contrat d'une dur�e inf�rieure ou �gale � 1 mois
	 * @param d dur�e du contrat en mois
	 * @throws Exception
	 */
	public static void CtrlSaisiDureeContrat(int d) throws Exception{
		if(d <= 1) {
			throw new Exception("Veuillez saisir un contrat d'une dur�e sup�rieure � 1 mois");
		}
	}

	/** Getter
	 * @return the contratAgence
	 */
	public String getContratAgence() {
		return contratAgence;
	}

	/** Setter
	 * @param contratAgence the contratAgence to set
	 */
	public void setContratAgence(String contratAgence) {
		this.contratAgence = contratAgence;
	}

	/** Getter
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/** Setter
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
}
