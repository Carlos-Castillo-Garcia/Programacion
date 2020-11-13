/**
 * 
 */
package UT3.ejercicios_teams.Doc3;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int base;
		int altura;
		int contador = 0;
		
		System.out.println("Introduzca un numero de * de la base, para dibujar el rectangulo: ");
		base = entrada.nextInt();
		
		System.out.println("Introduzca un numero de * de la altura, para dibujar el rectangulo: ");
		altura = entrada.nextInt();
		
		while(contador != altura) {
			int contador2 = 0;
			while(contador2 != base){
				contador2++;
				System.out.printf("* ");
			}
			contador++;
			System.out.printf("\n");
		}
		entrada.close();
	}

}
