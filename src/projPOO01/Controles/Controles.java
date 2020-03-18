package projPOO01.Controles;

import java.text.SimpleDateFormat;
import java.util.Date;

import projPOO01.Exceptions.ExceptionDate;
import projPOO01.Exceptions.ExceptionInt;

/** Classe qui permet d'effectuer des contr�les sur les dates et les nombres entiers saisis
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Controles {

	/** M�thode qui effectue un contr�le sur une date
	 * @param d une cha�ne de caract�res repr�sentant une date
	 * @return Date une date
	 * @throws ExceptionDate
	 */
	public static Date CtrlDate(String d) throws ExceptionDate{
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		sd.setLenient(false);
		Date dt = new Date();
		try {
			dt =sd.parse(d);
			
		}catch(Exception e) {
			throw new ExceptionDate("Mauvais format de date saisi");
		}
		return dt;
	}
	
	/** M�thode qui effectue un contr�le sur un nombre entier
	 * @param ns une cha�ne de caract�res repr�sentant un nombre entier
	 * @throws ExceptionInt
	 */
	public static void CtrlInt(String ns) throws ExceptionInt{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
		}catch(Exception e) {
			throw new ExceptionInt("Veuillez saisir un entier");
		}
		
		}
	
}
