/**
 * 
 */
package UT3.practicas;

import java.util.Scanner;
/**
 * @author CARLOS
 * Ejemplo de pedir datos
 */
public class ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para pedir datos necesitamos una variable de tipo scanner
		//en este caso la llamo "entrada" pero podria llamarse de cualquier modo
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Por favor, introduce un numero: ");
		
		//Guardo en la variable numero lo que el usuario introduzca por teclado.
		int numero = entrada.nextInt();
		
		System.out.print("El numero introducido es: ");
		System.out.println(numero);
		
		System.out.printf("prueba");
		
		entrada.close();
	}

}
