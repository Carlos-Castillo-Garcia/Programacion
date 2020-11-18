/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero[] = new int [10];
		int contador = 0;
		int aux = 0;
		
		for(int cont = 0; cont < numero.length; cont++) {
			System.out.printf("numero %d: ",cont+1);
			numero[cont] = entrada.nextInt();
		}
		
		do {
			
			for(int cont1 = 0; cont1 < numero.length; cont1++) {
				System.out.printf("");
				System.out.println("");
				
				for(int cont2 = 0; cont2 < numero.length; cont2++) {
					if(numero[cont1] != numero[cont2]) {
						aux = numero[cont2];
					}else {
						
					}
					
				}
				
			}
			
			contador++;
		}while(contador > numero.length);
		System.out.println("el numero "+aux+" es distinto");
		
		entrada.close();
	}

}
