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
		int vertical = 0;
		
		
		System.out.println("Introduzca un numero de *, para dibujar el triangulo: ");
		asteriscos = entrada.nextInt();

		while(vertical != asteriscos) {
			int horizontal = 0;
			vertical++;
			if(vertical == 0) {
				while(horizontal != asteriscos) {
					horizontal++;
					if(horizontal == vertical) {
						System.out.printf("*");
					}else{
						System.out.printf(" ");
					}
				}
			}else{
				while(horizontal != asteriscos) {
					horizontal++;
					if(horizontal != vertical) {
						System.out.printf("*");
					}else{
						System.out.printf(" ");
					}
				}
			}
			System.out.printf("\n");
		}


		entrada.close();
	}

}
