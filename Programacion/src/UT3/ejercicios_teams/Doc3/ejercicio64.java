/**
 * 
 */
package UT3.ejercicios_teams.Doc3;

import java.util.Scanner;

/**
 * @author CARLOS
 * 
 */
public class ejercicio64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int array1 [] = new int [5];
		int array2 [] = new int [5];		
		//primer conjunto
		for(int cont = 0; cont < array1.length; cont++) {
			System.out.println("Introduzca los numero que usted quiera en el array 1: ");
			array1[cont] = entrada.nextInt();
		}
		System.out.printf("\n\n\n\n");

		//segundo conjunto
		for(int cont = 0; cont < array1.length; cont++) {
			System.out.println("Introduzca los numero que usted quiera en el array 2: ");
			array2[cont] = entrada.nextInt();
		}

		System.out.printf("Estos son los numero introducidos en orden inverso: \n");
		for(int cont = 0, con = 1; cont < array1.length; cont++, con++) {
			System.out.printf("%dº  %d ; %d \n", con, array1[cont], array2[cont]);
			
		}

		
		entrada.close();
	}

}
