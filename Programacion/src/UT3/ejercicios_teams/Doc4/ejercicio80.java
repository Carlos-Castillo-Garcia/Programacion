/**
 * 
 */
package UT3.ejercicios_teams.Doc4;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		int num1 = entrada.nextInt();
		System.out.println("Escribe un numero: ");
		int num2 = entrada.nextInt();
		
		int max = maximo(num1, num2);
		
		System.out.println("El numero mas alto es: "+max);
		
		System.out.println(""+max());
		System.out.println(""+max);
		System.out.println(""+max);
		System.out.println(""+max);
		
		entrada.close();
	}

	
	private static int maximo(int num1, int num2) {
		int max = num1;
		
		if(num1>= num2) {
			
			max = num1;
		
		}else {
			max = num2;
		}
		
		return max;
		
	}
	
	private static int maximo2(int num1, int num2) {
		int max = num1;
		

		
		return max;
		
	}
	
	private static int maximoarray(int , int num2) {
		int max = num1;
		

		
		return max;
		
	}
	
}
