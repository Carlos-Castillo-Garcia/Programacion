/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int multiplo;
		int calculo;
		
		System.out.println("Estas son las tablas de multiplicar: ");
		
		for(multiplo = 1; multiplo <= 10; multiplo++) {
			System.out.printf("\nEsta es la tabla del %d: ", multiplo);
			System.out.println("\n");
			
			for(numero = 1; numero <= 10; numero++) {
				calculo = numero * multiplo;
				System.out.printf("%d x %d = %d\n",multiplo ,numero ,calculo);
				
			}
			
		}
		
		
		
		entrada.close();
	}

}
