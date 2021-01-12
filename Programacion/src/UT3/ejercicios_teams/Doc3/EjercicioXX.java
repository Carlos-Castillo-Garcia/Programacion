/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author carlos.cg
 *
 */
public class EjercicioXX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int dni;

		System.out.println("Introduzca su dni:");
		dni = entrada.nextInt();
		
		System.out.printf("Esta es tu letra de DNI %c", letraDNI(dni));

		entrada.close();		
	}
	
	private static char letraDNI(int dni) {
		char resultado;
		
		char letras [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D','X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		int resto;
		resto = dni%23;
		resultado = letras[resto];

		return resultado;		
	}

}
