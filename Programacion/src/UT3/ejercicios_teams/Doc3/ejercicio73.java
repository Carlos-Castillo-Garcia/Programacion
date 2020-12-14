/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int array [] = new int [10];
		int numero;
		
		for(int posi = 0; posi < array.length; posi++) {
			System.out.println("Escriba un numero");
			numero = entrada.nextInt();
			
			if(posi==0) {
				array[posi]=numero;
			}else {
				for(int posi2 = 0; posi2<posi;posi2++) {
					if(array[posi2]==numero) {
						System.out.println("ya ha lo has introducido");
						posi--;
					}else {
						array[posi]= numero;
					}
				}
			}
		}
		
		for(int cont = 0; cont<array.length;cont++) {
			System.out.printf("\n%d ", array[cont]);
		}
	}

}
