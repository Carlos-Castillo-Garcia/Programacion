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
	
	public static int salir(Scanner entrada) {
		int salir = 0;
		System.out.println("¿Desea salir del programa? ( 0 = No ; 1 = Si )");  
		salir = entrada.nextInt();                                          
		if(salir == 1) {                                                     
			System.out.println("Hasta luego");                           
		}else {                                                               
			System.out.println("");               							
		}	
		return salir;
	}
}
