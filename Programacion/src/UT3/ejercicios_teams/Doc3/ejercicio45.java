/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int lado;
		int contvertical = 1;
		
		System.out.println("Introduzca un numero de * por lado, para dibujar el cuadrado: ");
		lado = entrada.nextInt();

		//vertical
		while(contvertical <= lado) {
			int conthorizontal = 1;
			//horizontal
			if(contvertical == 1 || contvertical == lado) {
				
				while(conthorizontal <= lado){
					conthorizontal++;
					System.out.printf("* ");
				}
				
			}else {
				
				while(conthorizontal <= lado){

					if(conthorizontal == 1 || conthorizontal == lado) {
						conthorizontal++;
						System.out.printf("* ");
					}else {
						conthorizontal++;
						System.out.printf("  ");
					}

				}
			}
			contvertical++;
			System.out.printf("\n");
		}
		

		entrada.close();
	}

}