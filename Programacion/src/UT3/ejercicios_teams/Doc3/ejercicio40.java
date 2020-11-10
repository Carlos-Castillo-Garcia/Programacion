/**
 * 
 */
package UT3.ejercicios_teams.Doc3;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int asteriscos;
		int contador = 0;
		int contador2 = 0;
		
		System.out.println("Introduzca un numero de *, para dibujar el triangulo: ");
		asteriscos = entrada.nextInt();

		while(contador != asteriscos) {
			
			
			if(contador < contador2) {
				while(contador2 != contador){
					contador++;
					System.out.printf("*");
				}
			}else {
				contador2++;
				System.out.printf("a");
			}
		}

		entrada.close();
	}

}
