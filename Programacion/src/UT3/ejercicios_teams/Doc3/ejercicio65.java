/**
 * 
 */
package UT3.ejercicios_teams.Doc3;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero[] = new int [10];
		int contcomp = 0;
		int c = 1;
		int d = 1;
		

		for(int cont = 0; cont < numero.length; cont++) {
			System.out.printf("numero %d: ",cont+1);
			numero[cont] = entrada.nextInt();
		}

		 do{

			if(numero[contcomp] < numero[contcomp+1]) {
				c++;
			}else if(numero[contcomp] > numero[contcomp+1]){
				d++;
			}
			
			contcomp++;
			
		}while(contcomp < numero.length-1);
		 
		 if(c == numero.length) {
			 System.out.println("Son crecientes ");
		 }else if(d == numero.length){
			 System.out.println("Son decrecientes ");
		 }else{
			 System.out.println("es desordenado ");
		 }

		entrada.close();
	}

}
