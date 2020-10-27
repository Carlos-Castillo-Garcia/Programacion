/**
 * 
 */
package UT3.Semanales;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class Semana3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada =new Scanner(System.in);
		
		int real;
		int estimacion;
		int minimo;
		int maximo;
		int division;
		int salir;
		
		minimo = 90 * 45;
		maximo = 120 * 90;
		
		
			do {
				System.out.print("Introduzca la medida real en metros cuadrados: ");
				real = entrada.nextInt();
				
				System.out.print("Introduzca la estimacion en campos de futbol: ");
				estimacion = entrada.nextInt();
				
				division=real/estimacion;
				
				if(division >= minimo && division <= maximo ) {
					System.out.println("SI, la estimacion es correcta");
				}else {
					System.out.println("NO, la estimacion no es correcta");
				}
				
//Salir-------------------------------------------------------------------------------------------------------
				System.out.println("¿Desea salir del programa? ( 1 = No ; 0 = Si )");
				salir = entrada.nextInt();

				if(salir == 0) {
					System.out.println("Hasta luego");
				}else {
					//System.out.println("Vuelva a introducir el precio");
				}

			}while(salir != 0);
			
			entrada.close();
	}

}
