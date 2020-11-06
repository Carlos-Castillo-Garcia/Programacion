/**
 * 
 */
package UT3.ejercicios_teams.Doc2;
import java.util.Scanner;
/**
 * @author carlos.cg
 *
 */
public class Ejercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		
		do {
			
			System.out.printf("Introduzca un numero: ");
			numero = entrada.nextInt();
			
			if(numero % 2 == 0) {
				
				contador = contador + numero;
			}
		}while(numero != 0);
		
		System.out.printf("Esta es la suma de los numeros pares: %d ", contador);
		
		entrada.close();
	}

}
