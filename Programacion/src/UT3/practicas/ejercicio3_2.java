/**
 * 
 */
package UT3;

import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio3_2 {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		
		 int numero = entrada.nextInt(); 	     

		    if (numero%2==0) 
		    { 
		    	System.out.println("es par");         
		    } else { 
		    	System.out.println("es impar"); 
		    } 
		 entrada.close();
	}

}
