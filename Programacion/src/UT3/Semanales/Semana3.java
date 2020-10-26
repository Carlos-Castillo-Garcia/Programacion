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
				
			}while(real !=0);
			entrada.close();
	}

}
