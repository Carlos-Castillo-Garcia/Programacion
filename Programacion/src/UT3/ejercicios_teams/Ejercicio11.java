/**
 * 
 */
package UT3.ejercicios_teams;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		float precio;
		
		
		
		//Pedir importe de compra 
			System.out.println("Introduzca su precio:");
		//Leer y guardar importe en variable importe de tipo float 
			precio = entrada.nextFloat();

			if(precio >= 200) {

					System.out.println("Tu precio sera: " +precio*0.8);
					

				}else if (precio >=100 && precio<200){

					System.out.println("Tu precio sera:" +precio*0.9);

				}else {
 
					System.out.println("Tu precio sera: " +precio);
				}
			
		 

		 

		  

		

		 

		
	
		
	}

}
