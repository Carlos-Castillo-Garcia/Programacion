/**
 * 
 */
package UT3.ejercicios_teams.Doc2;
import java.util.Scanner;
/**
 * @author CARLOS
 * pedir numeros hasta poner 0
 */
public class ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int numero_usuario;
		int suma_de_numeros;
		int aux;
		int total_suma = 0;

		System.out.println("Para parar este programa de suma tiene que poner un 0");

		do{
			
			System.out.print("Introduzca un numero: ");
			numero_usuario = entrada.nextInt();
			aux = numero_usuario;
			suma_de_numeros = aux + total_suma;
			total_suma = suma_de_numeros;

		}while(numero_usuario != 0);
		

		System.out.println("Esta es la suma de los numeros introducidos: " +suma_de_numeros );

		entrada.close();
	}

}
