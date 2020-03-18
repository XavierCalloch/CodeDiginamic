package projPOO01.GestionAchat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Classe qui repr�sente un achat
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Achat {
	/** date */
	private Date date;
	/** intitul� */
	private String intitule;
	/** quantit� */
	private int quantite;
	/** pattern de date */
	private String pattern = "dd-MM-yyyy";
	/** format de date */
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	
	
	/** Constructeur
	 * @param d une date
	 * @param i un intitul�
	 * @param q une quantit�
	 */
	public Achat(Date d, String i, int q) {
		// TODO Auto-generated constructor stub
		this.date =d;
		
		this.intitule =i;
		this.quantite =q;
	}

	@Override
	public String toString() {
			return intitule + "[date=" +sd.format(date) + ", quantite=" + quantite + "]";
		
		}
	
	
	

}
