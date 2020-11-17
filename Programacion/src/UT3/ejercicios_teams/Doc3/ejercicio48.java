/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int cont = 0;
		for(int cont1 = 0; cont != 4; cont1++) {
			System.out.println("Introduzca un numero y le digo las cifras que tiene: ");
			numero = entrada.nextInt();
	
			for(cont = 0; numero > 0; cont++) {
				numero = numero/10;
			}
		}
			
		
		entrada.close();
	}

}
