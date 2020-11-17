/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio47 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int cont = 0;
		
		System.out.println("Introduzca un numero y le digo las cifras que tiene: ");
		numero = entrada.nextInt();
		if(numero < 0) {
			numero = -numero;
		}
		for(cont = 0; numero > 0; cont++) {
			numero = numero/10;
		}
		System.out.printf("este es el numero de cifras de tu numero %d",cont);
		
		entrada.close();
	}

}
