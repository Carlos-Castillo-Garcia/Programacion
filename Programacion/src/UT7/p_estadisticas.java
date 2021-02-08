/**
 * 
 */
package UT7;

/**
 * @author Manuel
 *
 */
public class p_estadisticas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float prueba[] = {2, 4, 6, 8, 9, 2, 2, 1, 4, 5};
		float prueba2[] = new float[10];
		
		for (int p = 0; p<prueba2.length; p++) {
			prueba2[p] = (float) ((Math.random()*10)+1);
		}
		
		System.out.println(Estadistica.moda(prueba));
		System.out.println(Estadistica.media(prueba));
		
		System.out.println(Estadistica.variacionSR(3, 5));
		System.out.println(Estadistica.variacion(5, 6));
		System.out.println(Estadistica.permutaciones(7));
		
		
		
	}

}
