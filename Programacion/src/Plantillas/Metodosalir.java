/**
 * 
 */
package Plantillas;
import java.util.Scanner;

/**
 * @author PORTATIL 2
 *
 */
public class Metodosalir {
	
	public static String salir(Scanner entrada) {
		String salir = " ";
//		System.out.println("¿Desea salir del programa? ( 0 = No ; 1 = Si )");  
		salir = entrada.nextLine();                                          
		if(salir == "si") {                                                     
			System.out.println("Hasta luego");                           
		}else {                                                               
			System.out.println("");               							
		}	
		return salir;
	}
}
