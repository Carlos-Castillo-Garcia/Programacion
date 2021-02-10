/**
 * 
 */
package Plantillas;

/**
 * @author Manuel
 *
 */
public class Limpiar {

	public static void clspantalla() {
		   System.out.print("\033[H\033[2J");
		   System.out.flush();  
		}
}
