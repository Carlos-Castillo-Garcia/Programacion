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
		System.out.println("## Los rango para introducir los numero de la cartas son del 2 - 14(AS) ##");
		System.out.println("## Para introducir los palos debes de poner: ## ");
		System.out.println("			d = Diamantes \n 			c = Corazones \n 			t = Treboles \n 			p = Picas \n");
		System.out.println("Por favor introduzca las carta de su mano: \n");
		for(int mano = 0, nºcarta = 1 ;mano < 4;){
			System.out.printf("Carta %d \n", nºcarta);
			System.out.printf("Valor: ");
			valorcarta [mano] = entrada.nextInt();
			
			if(valorcarta[mano] >= 2 && valorcarta[mano] <= 14) {
				System.out.printf("Palo: ");
				palo [mano] = entrada.next().charAt(0);
				System.out.println("");
	
				if(palo[mano] == 'd' || palo[mano] == 'c' || palo[mano] == 't' || palo[mano] == 'p'){
					nºcarta++;
					mano++;
				}else {
					System.out.println("\n Palo erroneo \n");
				}
				
			}else {
				System.out.println("\n numero erroneo\n");
			}
		}
//FIN RECOGIDAD DE DATOS--------------------------------------------------
		
//COMPROBACION PALOS------------------------------------------------------
		
			if(palo[posipalocarta] == palo[posipalocarta+1] && palo[posipalocarta] == palo[posipalocarta+2] && palo[posipalocarta] == palo[posipalocarta+3]) {
//ORDENADO DE NUMERO DE CARTA---------------------------------------------
				Arrays.sort(valorcarta);
//FIN DE ORDENADO DE NUMERO DE CARTA--------------------------------------

//IMPRESION DE MANO-------------------------------------------------------
				System.out.printf("La mano que tenemos es: \n\n" );
				for(int manos = 0, cont1 = 1; manos < 4 ; manos++, cont1++) {
				System.out.printf(" 		carta %d = %d %c \n", cont1, valorcarta[manos], palo[manos]);
				}
//FIN DE IMPRESION DE MANO------------------------------------------------
				
//COMPROBACION DE NUMERO--------------------------------------------------
				contvalorcarta = 0;
				cont = 0;
				correlativo = 0;
//COMPROBACION DE CORRELATIVIDAD------------------------------------------
				while(valorcarta[contvalorcarta+1]-valorcarta[contvalorcarta] == 1 && cont < valorcarta.length-1){
					if(cont < valorcarta.length-2) {
						contvalorcarta++;
					}
					
					correlativo++;
					cont++;
					
				};
//FIN DE COMPROBACION DE CORRELATIVIDAD-----------------------------------
				if(correlativo == valorcarta.length-1) {					
//IMPRESION DE LA CARTA SIENDO CORRELATIVOS-------------------------------
					if(valorcarta[posivalorcarta] == 2 ) {
						System.out.printf("               ---------------");
						System.out.printf("\nNecesitas	carta 5 = %d %c", valorcarta[posivalorcarta]+4, palo[posipalocarta]);
						System.out.printf("\n               ---------------");
						
					}else if(valorcarta[valorcarta.length-1] == 14){
						System.out.printf("               ----------------");
						System.out.printf("\nNecesitas	carta 5 = %d %c", valorcarta[posivalorcarta]-1, palo[posipalocarta]);
						System.out.printf("\n               ----------------");
					}else {
						System.out.printf("               ----------------");
						System.out.printf("\nNecesitas	carta 5 = %d %c", valorcarta[posivalorcarta]-1, palo[posipalocarta]);
						System.out.printf("\nO");
						System.out.printf("\nNecesitas	carta 5 = %d %c", valorcarta[posivalorcarta+3]+1, palo[posipalocarta]);
						System.out.printf("\n               ----------------");
					}
//IMPRESION DE LA CARTA SIENDO CORRELATIVOS--------------------------------
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
				System.out.printf("Con las cartas de estos palos no se puede hacer una escalera de color");
			}
//FIN COMPROBACION PALOS------------------------------------------------------
		

		
		entrada.close();
	}

}



































