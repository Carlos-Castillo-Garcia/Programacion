/**
 * 
 */
package UT3.practicas;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio_papa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner entrada = new Scanner(System.in);
           int numero,sumadig=0;     
           
           System.out.println("ingrese el numero");
           numero= entrada.nextInt(); 
           int aux= numero; 
           while (numero != 0) {    
        	  
        	      sumadig = sumadig + (numero % 10);
        	       numero = numero/10;
	        
           System.out.println("La suma de los digitos de "+ aux +" es "+ sumadig);      
           }
           entrada.close();
	}
}
