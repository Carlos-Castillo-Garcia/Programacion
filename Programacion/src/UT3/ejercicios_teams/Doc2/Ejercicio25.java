/**
 * 
 */
package UT3.ejercicios_teams.Doc2;
import java.util.Scanner;
/**
 * @author carlos.cg
 *
 */
public class Ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		do {
			
			System.out.printf("\nIntroduzca un numero: ");
			numero = entrada.nextInt();
			if(numero > 1){
				if(numero == 2 || numero == 3 || numero == 5 || numero == 7) {
					
					System.out.printf("Es un numero primo:%d", numero);
					
				}else {
					
					if(numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0) {
						
						System.out.printf("Es un numero primo:%d", numero);
						
					}else {
						
						System.out.printf("No es un numero primo:%d", numero);
						
						}
				}
				
			}else{
					
				System.out.println("El numero debe ser mayor de 1");
					
			}
			
				
		}while(numero != 0);
		
		entrada.close();
		

	}

}
