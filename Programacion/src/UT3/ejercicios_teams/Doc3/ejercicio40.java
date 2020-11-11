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
		int contadorinverso;
		
		System.out.println("Introduzca un numero de *, para dibujar el triangulo: ");
		asteriscos = entrada.nextInt();

		contadorinverso = asteriscos;
		
		while(vertical != asteriscos) {
			vertical++;
			for(int contadorinverso2 = 0; contadorinverso2 < contadorinverso; contadorinverso2++){
				System.out.printf(" ");
			}
			for(int horizontal = 0; horizontal != vertical; horizontal++) {
				System.out.printf("* ");
			}
			contadorinverso--;
			System.out.printf("\n");
		}


		entrada.close();
	}

}
