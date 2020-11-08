/**
 * 
 */
package UT3.Semanales;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class semanal4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int arana;
		int elefante = 0;
		int salir;
		int reiniciar = 1;
		
		do {
		
			System.out.println("Introduzca el peso que soporta la tela de araña: ");
			arana = entrada.nextInt();
			int contador = 0;
			int suma = 0;


			do {

				while(suma <= arana) {
					contador ++;
					System.out.printf("Introduzca el peso del elefante %d: ", contador);
					elefante = entrada.nextInt();
					suma = suma + elefante;


					if(elefante == 0 && elefante <= arana) {
						System.out.println("la tela de araña aun aguanta. \n");
					}else {
						if(suma <= arana) {

						}else {
							System.out.println("la tela de araña se ha roto. \n");
						}
					}
				}

			}while(reiniciar != 1);
			
//SALIR########################################################################################
			System.out.println("¿Desea salir el programa? ( 0 = No ; 1 = Si )");	    //#####
			salir = entrada.nextInt();                                              	//#####
																				    	//#####
			if(salir == 1) {                                                        	//#####
				System.out.println("Hasta luego");                                  	//#####
			}else {                                                                 	//#####
				System.out.println("Se reiniciara el programa");				    	//#####
			}																	    	//#####
//SALIR########################################################################################

		}while(salir != 1);
		
		entrada.close();
	}

}
