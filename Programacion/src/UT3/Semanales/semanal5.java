/**
 * 
 */
package UT3.Semanales;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author CARLOS
 *
 */
public class semanal5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
//INICIO-----------------------------------------------------------------
		char palo [] = new char [4];
		int valorcarta[] = new int [4];
		int posipalocarta = 0;
		int posivalorcarta = 0;
		int contvalorcarta;
		int correlativo;
		int cont;
		

//RECOGIDA DE DATOS------------------------------------------------------
		for(int mano = 0, nºcarta = 1 ;mano < 4;){
			System.out.printf("Carta %d \n", nºcarta);
			System.out.printf("Valor: ");
			valorcarta [mano] = entrada.nextInt();
			
			if(valorcarta[mano] >= 2 && valorcarta[mano] <= 14) {
				System.out.printf("Palo: ");
				palo [mano] = entrada.next().charAt(0);
	
				if(palo[mano] == 'd'){
					System.out.println("\n\n funciona diamantes\n\n");
					nºcarta++;
					mano++;
				}else  if(palo[mano] == 'c'){
					System.out.println("\n\n funciona corazones\n\n");
					nºcarta++;
					mano++;
				}else if(palo[mano] == 't') {
					System.out.println("\n\n funciona treboles\n\n");
					nºcarta++;
					mano++;
				}else if(palo[mano] == 'p') {
					System.out.println("\n\n funciona picas\n\n");
					nºcarta++;
					mano++;
				}else {
					System.out.println("\n\n Palo erroneo \n\n");
				}
				
			}else {
				System.out.println("\n\n numero erroneo\n\n");
			}
		}
//FIN RECOGIDAD DE DATOS--------------------------------------------------
		
//COMPROBACION PALOS------------------------------------------------------
		
			if(palo[posipalocarta] == palo[posipalocarta+1] && palo[posipalocarta] == palo[posipalocarta+2] && palo[posipalocarta] == palo[posipalocarta+3]) {
				Arrays.sort(valorcarta);
				System.out.printf("La mano que tenemos es: \n\n" );
				for(int manos = 0, cont1 = 1; manos < 4 ; manos++, cont1++) {
				System.out.printf(" 		carta %d = %d %c \n", cont1, valorcarta[manos], palo[manos]);
				}
				contvalorcarta = -1;
				cont = 0;
				correlativo = 0;
				do{
					contvalorcarta++;
					cont++;
					correlativo++;
				}while(valorcarta[contvalorcarta+1]-valorcarta[contvalorcarta] == 1 && cont < valorcarta.length);
				
				if(correlativo == valorcarta.length-2) {
					
					if(valorcarta[posivalorcarta] == 2 ) {
						System.out.printf("               ---------------");
						System.out.printf("\nNecesitas	carta 5 = %d %c", valorcarta[posivalorcarta]+4, palo[posipalocarta]);
						System.out.printf("\n               ---------------");
						
					}else if(valorcarta[valorcarta.length-1] == 14){
						System.out.printf("               ----------------");
						System.out.printf("\nNecesitas	carta 5 = %d %c", valorcarta[posivalorcarta]-1, palo[posipalocarta]);
						System.out.printf("\n               ----------------");
					}
				}else {
					if(valorcarta[valorcarta.length-1]-valorcarta[posivalorcarta] == valorcarta.length) {
						contvalorcarta = -1;
						cont = 0;
						correlativo = 0;
						do{
							contvalorcarta++;
							cont++;
							correlativo++;
						}while(valorcarta[contvalorcarta+1]-valorcarta[contvalorcarta] == 1 && cont < valorcarta.length );
						
						System.out.printf("               ---------------");
						System.out.printf("\nNecesitas	carta 5 = %d %c", valorcarta[contvalorcarta]+1, palo[posipalocarta]);
						System.out.printf("\n               ---------------");
						
					}else {
						System.out.print("No es posible hacer escalera de color");
					}
					
				}
				
				
			}else {
				System.out.printf(" error de palos");
			}
		

		
		entrada.close();
	}

}



































