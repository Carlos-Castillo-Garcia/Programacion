/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		int num2;
		int diff;
		
		System.out.printf("Introduzca un numero para sacar el listado: ");
		num1 = entrada.nextInt();
		System.out.printf("Introduzca otro numero para sacar el listado: ");
		num2 = entrada.nextInt();
		
			if(num1 < num2) {
				diff = num2 - 2;
				if(diff % 2 == 0) {
					//par
					System.out.printf("esta es la cadena de numero con intervalo par: ");
					for(int contador = 0; contador < num2;contador = contador + 2, num1 = num1 + 2 ) {
						System.out.printf("%d " ,num1);
					}
					System.out.printf("%d " ,num2);
				}else {
					//impar
					System.out.printf("esta es la cadena de numero con intervalo impar: ");
					for(int contador = 0; contador < num2; contador++, num1++) {
						System.out.printf("%d " ,num1);
					}
				}
				
			}else {
				System.out.printf("num1 es mayor");
				diff = num2 - num1;
				if(diff % 2 == 0) {
					//impar
					System.out.printf("esta es la cadena de numero con intervalo impar: ");
					for(int contador = 0; contador < num1; contador++, num2++) {
						System.out.printf("%d " ,num2);
					}

				}else {
					//par
					System.out.printf("esta es la cadena de numero con intervalo par: ");
					for(int contador = 0; contador < num1;contador = contador + 2, num2 = num2 + 2 ) {
						System.out.printf("%d " ,num2);
					}
					System.out.printf("%d " ,num2);
				}
			}
		
		
		entrada.close();
	}

}
