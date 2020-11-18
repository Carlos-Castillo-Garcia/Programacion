/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero[][] = new int [10][10];
		
		for(int cont = 0; cont < numero.length; cont++) {
			System.out.printf("numero %d: ",cont+1);
			numero[cont][cont] = entrada.nextInt();
		}
		
		for(int cont1 = 1; cont1 <= numero.length; cont1++) {
			
			for(int cont2 = 1; cont2 <= numero.length; cont2++) {
				System.out.print(cont1*cont2+ "\t");
			}
			System.out.println("");
		}
		entrada.close();
	}

}
