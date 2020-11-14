/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio45_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int lado;

		System.out.println("Introduzca un numero de * por lado, para dibujar el cuadrado: ");
		lado = entrada.nextInt();

		for(int exterior = 0; exterior < lado; exterior++) {
			System.out.printf("* ");
		}
		System.out.println();

		for(int exterior = 0; exterior < lado - 2; exterior++) {
			System.out.printf("* ");
			if ( exterior == 0 || exterior == lado - 3) {
				
				for(int vacio = 1; vacio < lado - 1;) {
					System.out.printf("  ");
					vacio++;
				}
			}else {
				System.out.printf("  ");
				for(int interior = 1; interior <= (lado - 2) - 2;) {
					System.out.printf("* ");
					interior++;
				}
				System.out.printf("  ");
			}	
			
			System.out.println("* ");
		}

		for(int exterior = 0; exterior < lado; exterior++) {
			System.out.printf("* ");
		}

		entrada.close();
	}

}