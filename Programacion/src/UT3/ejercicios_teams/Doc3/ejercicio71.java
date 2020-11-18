/**
 * 
 */
package UT3.ejercicios_teams.Doc3;

/**
 * @author CARLOS
 *
 */
public class ejercicio71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		double tabla1 [][] = new double [3][3];

		double tabla2 [][] = new double [3][3];

		int tablasuma [][] = new int [3][3];

		for(int cont = 0; cont < tabla1.length; cont++) {
			for(int cont2 = 0;cont2 < tabla1.length;cont2++) {
				tabla1[cont][cont2] = Math.floor(Math.random()*100);
			}
		}

		for(int cont = 0; cont < tabla2.length; cont++) {
			for(int cont2 = 0;cont2 < tabla2.length;cont2++) {
				tabla2[cont][cont2] = Math.floor(Math.random()*100);
			}
		}

		for(int contsum = 0, cont = 0; contsum < tablasuma.length; contsum++, cont++) {
			for(int contsum2 = 0, cont2 = 0; contsum2 < tablasuma.length; contsum2++, cont2++) {
				tablasuma[contsum][contsum2] = (int) (tabla1[cont][cont2] + tabla2[cont][cont2]);

				System.out.print(tabla1[cont][cont2]+"+"+tabla2[cont][cont2]+"="+tablasuma[contsum][contsum2]+"\n");
				
			}
			System.out.println("");
		}

	}

}
