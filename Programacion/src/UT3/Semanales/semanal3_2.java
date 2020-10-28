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
		
		int superficie;
		int estimacion;
		int minimo;
		int maximo;
		int division;

		
		minimo = 90 * 45;
		maximo = 120 * 90;
		
		
			do {

				System.out.print("Introduzca la medida superficie en metros cuadrados: ");
				superficie = entrada.nextInt();
				
				if(superficie !=0) {

					System.out.print("Introduzca la estimacion en campos de futbol: ");
					estimacion = entrada.nextInt();
					
					if(estimacion != 0) {
						
						division=superficie/estimacion;
						
						if(division >= minimo && division <= maximo ) {
							System.out.println("SI, la estimacion es correcta");
						}else {
							System.out.println("NO, la estimacion no es correcta");
						}
						
					}else {
						System.out.println("la estimacion no puede ser un cero");
					}
					
				}else {
					System.out.println("hasta luego");
				}

			}while(superficie != 0);
			
			entrada.close();
	}

}
