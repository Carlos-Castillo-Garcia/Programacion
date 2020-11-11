/**
 * 
 */
package UT3.ejercicios_teams.Doc3;

/**
 * @author CARLOS
 *
 */
public class ejercicio43 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador;
		int contador2;
		int numero = 0;

		for(contador = 2; numero < 12; contador++, numero++){
			//System.out.println("a");
			if(contador == 2 || contador == 3 || contador == 5 || contador == 7 || contador == 11) {
				//System.out.println("b");
				for(contador2 = 2;contador2 < 12; contador2++) {
					//System.out.println("c");
					if(contador2 == 2 || contador2 == 3 || contador2 == 5 || contador2 == 7 || contador2 == 11) {
						System.out.printf("Este es el producto: %d * %d= %d \n",contador, contador2, contador*contador2);
					}
				}
			}
		}
	}
}
