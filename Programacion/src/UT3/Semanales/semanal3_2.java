/**
 * 
 */
package UT3.Semanales;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class semanal3_2 {

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
		int division = 0;
		//int salir;
		
		minimo = 90 * 45;
		maximo = 120 * 90;
		
		
			do {


				
				if(division >= minimo && division <= maximo ) {
					System.out.println("SI, la estimacion es correcta");
				}else {
					System.out.println("NO, la estimacion no es correcta");
				}
				

				
				System.out.print("Introduzca la estimacion en campos de futbol: ");
				estimacion = entrada.nextInt();
				
				System.out.print("Introduzca la medida real en metros cuadrados: ");
				real = entrada.nextInt();
				
				division=real/estimacion;
////Salir-------------------------------------------------------------------------------------------------------
//				System.out.println("¿Desea salir del programa? ( 1 = No ; 0 = Si )");
//				real = entrada.nextInt();
//
//				if(real == 0) {
//					System.out.println("Hasta luego");
//				}else {
//					//System.out.println("Vuelva a introducir el precio");
//				}

			}while(real != 0);
			
			entrada.close();
	}

}
