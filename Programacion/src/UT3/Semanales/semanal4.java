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
		int elefante;
		int salir;

		do {
		
			System.out.println("Introduzca el peso que soporta la tela de araña: ");
			arana = entrada.nextInt();
				int contador = 0;
				int suma = 0;

				do{
					contador ++;
					System.out.printf("Introduzca el peso del elefante %d: ", contador);
					elefante = entrada.nextInt();
					suma = suma + elefante;

					if(elefante == 0) {
						System.out.println("la tela de araña aun aguanta. \n");
					}	
					if(suma > arana) {
						System.out.println("la tela de araña se ha roto. \n");
					}
				}while(elefante != 0 && suma <= arana);

				//SALIR########################################################################################
				System.out.println("¿Desea salir el programa? ( 0 = No ; 1 = Si )");	  	//#####
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
