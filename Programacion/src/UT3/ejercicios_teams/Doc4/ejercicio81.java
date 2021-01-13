/**
 * 
 */
package UT3.ejercicios_teams.Doc4;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio81 {

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
		
		intervalo(num1, num2);
	}
	
	private static int intervalo(int a, int b) {
		int result = 0;
		if(a>b) {
			b=b-1;
			for(int i = b; i< a; i++) {
				result = b++;
				System.out.println(b);
			}
		}else {
			a=a-1;
			for(int i = a; i< b; i++) {
				result = a++;
				System.out.println(a);
			}
		}
		return result;
	}
	
	private static int[] interarrar() {
		
		
		
		int[] array = new int[5];
		
		
	
	}

}
