/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int lado;
		int contador = 0;
		
		System.out.println("Introduzca un numero de * por lado, para dibujar el cuadrado: ");
		lado = entrada.nextInt();

		while(contador != lado) {
			int contador2 = 0;
			while(contador2 != lado){
				contador2++;
				System.out.printf("*");
			}
			contador++;
			System.out.printf("\n");
		}

		entrada.close();
	}

}
