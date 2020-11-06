/**
 * 
 */
package UT3.ejercicios_teams.Doc2;
import java.util.Scanner;
/**
 * @author carlos.cg
 *
 */
public class Ejercicio23{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int inicio;
		
		System.out.printf("Introduca un numero: ");
		numero = entrada.nextInt();
		
		System.out.printf("Estos son los numeros pares: ");
		
		for(inicio = 0; inicio <= numero; inicio = inicio + 2)
		{
			System.out.printf("%d" ,inicio);
			
			if(inicio < numero) {
				System.out.printf(",");
			}
		}
		
		entrada.close();
	}
}