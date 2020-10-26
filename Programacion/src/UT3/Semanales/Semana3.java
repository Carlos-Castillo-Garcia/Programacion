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
		Scanner entrada2 =new Scanner(System.in);
		
		int real;
		int estimacion;
		int calculoenmetroscuadrados_largo;
		int calculoenmetroscuadrados_ancho;
		
			do {	
				System.out.print("Introduzca la estimacion en campos de futbol: ");
				estimacion = entrada2.nextInt();
				
				System.out.print("Introduzca la medida real en metros cuadrados: ");
				real = entrada.nextInt();
				
				
			}while(real !=0);
			entrada2.close();
			entrada.close();
	}

}
