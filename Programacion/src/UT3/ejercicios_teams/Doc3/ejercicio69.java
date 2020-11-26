/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int posiciones [] = new int [10];
		int posi;
		int numero;

		for(int cont = 0; cont < posiciones.length-2; cont++) {
			System.out.println("introduzca ocho numeros distintos: ");
			posiciones[cont] = entrada.nextInt();
		}



		for(int inumeros = 0; inumeros<2; inumeros++) {

			System.out.println("\nintroduca la posicion en la que quiere el numero: ");
			posi = entrada.nextInt();

			System.out.println("introduca el numero que quiere introducir en la posicion: ");
			numero = entrada.nextInt();

			for(int posihaciatras=9; posihaciatras>posi;posihaciatras--) {
				posiciones[posihaciatras]=posiciones[posihaciatras-1];
			}
			posiciones[posi] = numero;
			
		}
		for(int pint = 0; pint<posiciones.length; pint++) {
			System.out.printf("%d", posiciones[pint]);
		}
		entrada.close();
	}

}
