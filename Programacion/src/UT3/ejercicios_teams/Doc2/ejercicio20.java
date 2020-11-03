/**
 * 
 */
package UT3.ejercicios_teams.Doc2;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio20 {

	/**
	 * @param args
	 */
    public static void main(String[] args) { 

		Scanner entrada = new Scanner(System.in);

		int numero_usuario;
		int suma_de_numeros;
		int aux;
		int media;
		int total_suma = 0;
		int contador = -1;


		System.out.println("Para parar este programa de suma tiene que poner un 0");

		do{
			
			contador = contador + 1;
			
			System.out.print("Introduzca un numero: ");
			numero_usuario = entrada.nextInt();
			aux = numero_usuario;
			suma_de_numeros = aux + total_suma;
			total_suma = suma_de_numeros;

			
		}while(numero_usuario != 0);

		System.out.println("Esta es la suma de los numeros introducidos: " +suma_de_numeros );
		
		media = suma_de_numeros / contador;
		System.out.println("Esta es la media: " +media);
		
		entrada.close();
    } 
}

  