/**
 * 
 */
package UT3.Plantillas;
import java.util.Scanner;
/**
 * @author carlos.cg
 *
 */
public class Salir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DECLARA SCANNER#####################################################################
																			   //#####
		Scanner entrada = new Scanner(System.in);							   //#####
																			   //#####
//####################################################################################
		
//DECLARAR LA VARIABLE DE SALIDA######################################################
																			   //#####
		int salir;							           						   //#####
		   																	   //#####
//####################################################################################
		
//SALIR###############################################################################
		System.out.println("¿Desea salir del programa? ( 0 = No ; 1 = Si )");  //#####
		salir = entrada.nextInt();                                             //#####
																			   //#####
		if(salir == 1) {                                                       //#####
			System.out.println("Hasta luego");                                 //#####
		}else {                                                                //#####
			System.out.println("Vuelva a introducir el precio");               //#####
		}																	   //#####
//SALIR###############################################################################
		entrada.close();
	}
	
}
