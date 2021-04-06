/**
 * 
 */
package basicos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author PORTATIL 2
 *
 */
public class FueradeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int indice, indice2;
		boolean ok = false;
		int[] test = {1,2,3,4,5,6,7,8,9,10};
		
		while(!ok) {	
			System.out.println("introduce un indice del array: ");

			try {
				indice = sc.nextInt();
				System.out.println("El valor es " + test[indice]);
				ok = true;
			}catch(ArrayIndexOutOfBoundsException laexcepcion){
				System.out.println("El indice esta fuera del array");
				System.out.println("Ha ocurrido una excepcion\n" + laexcepcion.getMessage());
			}catch(InputMismatchException ie) {
				System.out.println("El indice esta fuera del array");
				System.out.println("Ha ocurrido una excepcion" + ie.toString());
			}catch(Exception e){
				System.out.println("Ha ocurrido una excepcion" + e.toString());
			}finally {
				sc = new Scanner(System.in);
			}
			
			System.out.println("introduce otro indice del array: ");
			try {
				indice2 = sc.nextInt();
				System.out.println("El valor es " + test[indice2]);
				ok = true;
			}catch(ArrayIndexOutOfBoundsException laexcepcion){
				System.out.println("El indice esta fuera del array");
				System.out.println("Ha ocurrido una excepcion\n" + laexcepcion.getMessage());
			}catch(InputMismatchException ie) {
				System.out.println("El indice esta fuera del array");
				System.out.println("Ha ocurrido una excepcion" + ie.toString());
			}
		}
		
		sc.close();
	}

}
