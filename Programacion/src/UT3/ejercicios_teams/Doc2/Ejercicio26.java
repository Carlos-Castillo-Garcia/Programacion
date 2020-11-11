/**
 * 
 */
package UT3.ejercicios_teams.Doc2;
import java.util.Scanner;
/**
 * @author carlos.cg
 *
 */
public class Ejercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int contador;
		
		System.out.printf("Introduzca un numero: ");
		numero = entrada.nextInt();
		
		System.out.printf("Estos son los numero primos hasta el indicado: " );
		
		for(contador = 0;contador <= numero; contador++ ) {

			if(contador > 1){
				if(contador == 2 || contador == 3 || contador == 5 || contador == 7) {
					
					System.out.printf("%d", contador);
					if(contador < numero) {
						System.out.printf(",");
					}
					
				}else {
					
					if(contador % 2 != 0 && contador % 3 != 0 && contador % 5 != 0 && contador % 7 != 0) {
						
						System.out.printf("%d", contador);
						if(contador < numero) {
							System.out.printf(",");
						}
						
					}else {						
						}
				}
				
			}else{	
			}
		}	
		entrada.close();
		

	}

}
