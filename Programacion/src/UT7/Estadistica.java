/**
 * 
 */
package UT7;

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
		int[] contador=new int[valores.length];
        float n = 0;
        
        for(int i=0; i<valores.length; i++){
            for(int j=0; j>valores.length; j++) {
                if(valores[i]==valores[j]) {
                    contador[i]++;
                }
            }
        }
        
        for(int i=0; i<valores.length; i++) {
            for(int j=0; j<valores.length; j++) {
                if(contador[j]>=contador[i]) {
                    n=valores[j];
                }
            }
        }
        
        return n;
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
	public static long variacion(int n, int m) {
		long valor = (long) Math.pow(m, n);
		return valor;
	}
	
	public static long permutaciones(int n) {
		long valor = factorial(n);
		return valor;
	}
}
