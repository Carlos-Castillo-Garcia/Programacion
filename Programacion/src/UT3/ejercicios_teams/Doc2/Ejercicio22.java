/**
 * 
 */
package UT3.ejercicios_teams.Doc2;
import java.util.Scanner;
/**
 * @author carlos.cg
 *
 */
public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		int num1;
		int potencia;
		int resultado = 1;
		
		System.out.printf("Esciba la base de la potencia: ");
		num1 = entrada.nextInt();
		System.out.printf("Escriba la potencia: ");
		potencia = entrada.nextInt();
				
		while(contador < potencia) {
			contador = contador+1;
			System.out.println(contador);
			resultado = resultado*num1;
			
		}
		System.out.printf("Este es el resultado: %d", resultado);

		entrada.close();
	}

}
