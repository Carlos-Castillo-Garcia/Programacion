/**
 * 
 */
package Plantillas;
import java.util.Scanner;
/**
 * @author carlos.cg
 *
 */
public class pedirdatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
//ENTEROS#####################################################		
		System.out.printf("Introduzca un dato entero:");
		int entero = entrada.nextInt();
		System.out.printf("", entero);
		
		entrada.close();
	}

}
