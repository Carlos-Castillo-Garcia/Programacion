/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero[] = new int[10];	
		int media = 0;
		
		
		for(int cont = 0; cont < numero.length ; cont++) {
			System.out.println("Introduzca un numero: ");
			numero[cont] = entrada.nextInt();
			}
		
		for(int cont = 0; cont < numero.length ; cont++) {
			media = media + numero[cont];
		
			}

		System.out.println("esta es la media: " +media/10);
		
		entrada.close();
	}

}
