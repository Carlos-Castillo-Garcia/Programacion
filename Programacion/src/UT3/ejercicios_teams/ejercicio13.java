/**
 * 
 */
package UT3.ejercicios_teams;
import	java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Introduzca su nota: ");
		nota = entrada.nextInt();
		
		if (nota >= 0 || nota <= 4) {
				System.out.println("INSUFICIENTE");
			}else if (nota == 5){
				System.out.println("SUFICIENTE");
				}else if (nota == 6){
						System.out.println("BIEN");
					}else if (nota >= 7 || nota <= 8) {
							System.out.println("NOTABLE");
					}else if (nota >= 9 || nota <= 10) {
							System.out.println("SOBRESALIENTE");
			}else {
				System.out.println("Error");
			}
		entrada.close();

	}
}
