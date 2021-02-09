/**
 * 
 */
package UT7.UT7_Esatadistica;

/**
 * @author Manuel
 *
 */
public class Estadistica {

	public static float media(float[] valores) {
		float media = 0;
		for (float i: valores) {
			media = media+i;
		}
			media = media/valores.length;
		return media;
	}
	
	public static float moda(float[] valores) {
	    int maximoNumRepeticiones= 0;
	    float moda= 0;

	    for(int i=0; i<valores.length; i++)
	    {
	        int numRepeticiones= 0;
	        for(int j=0; j<valores.length; j++)
	        {
	            if(valores[i]==valores[j])
	            {
	                numRepeticiones++;
	            }   //fin if
	            if(numRepeticiones>maximoNumRepeticiones)
	            {
	                moda= valores[i];
	                maximoNumRepeticiones= numRepeticiones;
	            }   //fin if
	        }
	    }   //fin for
	    return moda;
	}
	
	private static int factorial(int valor) {
		if(valor == 1) {
			return 1;
		}else {
			return valor*factorial(valor-1);
		}
	}
	public static long variacionSR(int n, int m) {
		long valor = factorial(m)/factorial(m-n);
		return valor;
	}
	public static double variacion(int n, int m) {
		double valor = Math.pow(m, n);
		return valor;
	}
	
	public static long permutaciones(int n) {
		long valor = factorial(n);
		return valor;
	}
}
