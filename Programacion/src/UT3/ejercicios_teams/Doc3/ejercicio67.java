/**
 * 
 */
package UT3.ejercicios_teams.Doc3;

/**
 * @author CARLOS
 *
 */
public class ejercicio67{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1 [] = new int [10];
		int array2 [] = new int [10];
		int conta = 0;
		
		for(int cont = 0; cont<array1.length; cont++) {
			 array1[cont] = (int) (Math.random()*50)+1;
		}
		
		for(int cont = 0; cont<array2.length; cont++) {
			 array2[cont] = (int) (Math.random()*50)+1;
		}
		
		for(int comparar1 = 0; comparar1<array1.length;comparar1++) {
			for(int comparar2 = 0; comparar2<array1.length; comparar2++) {
				if(array1[comparar1] == array2[comparar2]) {
					System.out.printf("Este numero se repite: %d\n", array1[comparar1]);
				}else {
					conta++;
				}
			}
		}
		if(conta == 100) {
			System.out.println("No se repite ningun numero");
		}
	}

}
