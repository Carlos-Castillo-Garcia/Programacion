/**
 * 
 */
package UT3.ejercicios_teams.Doc2;
import java.util.Scanner;

/**
 * @author CARLOS
 * ejercicio 16 al reves
 */
public class ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
				
		int valor_1;
		int valor_2;
		int intervalo;

		System.out.println("Ecriba un numero: ");
		valor_1 = entrada.nextInt();
		System.out.println("Escribe un segundo numero: ");
		valor_2 = entrada.nextInt();
		System.out.println("Escriba un intervalo: ");
		intervalo = entrada.nextInt();
	
		while( valor_1 < valor_2) {
			System.out.println(valor_1);
			valor_1 = valor_1 + intervalo;
		}
		while(valor_1 >= valor_2){
			System.out.println(valor_2);
			valor_2 = valor_2 + intervalo;
		}
		
		entrada.close();

	}

}
