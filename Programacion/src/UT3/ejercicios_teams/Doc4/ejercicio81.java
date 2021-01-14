/**
 * 
 */
package UT3.ejercicios_teams.Doc4;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio81 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int array1[];
		int array2[];
		int intervalo = 0;
		
		num1 = pedida(num1, entrada);  
		num2 = pedida(num2, entrada);
		intervalo(num1, num2);
		
		num1 = pedida(num1, entrada); 
		num2 = pedida(num2, entrada);
		array1 = new int[contador(num1, num2, 1)];
		relleno(num1, num2, array1);
		pinta(array1);
		
		num1 = pedida(num1, entrada);
		num2 = pedida(num2, entrada);
		intervalo = pedida(intervalo, entrada);
		array2 = new int[contador(num1, num2, intervalo)];
		interarray(array2, num1, num2, intervalo);
		pinta(array2);
		
		entrada.close();
	}
	
	private static int pedida(int a, Scanner b) {
		System.out.println("Escribe un numero: ");
		a = b.nextInt();
		
		return a;
	}
	private static int contador(int a, int b, int intervalo) {
		int contador = 1;
		do {
			a = a + intervalo;
			contador++;
		}while(a<b);
		return contador;
	}
	private static int intervalo(int a, int b) {
		int result = 0;
		if(a>b) {
			b=b-1;
			for(int i = b; i< a; i++) {
				result = b++;
				System.out.println(b);
			}
		}else {
			a=a-1;
			for(int i = a; i< b; i++) {
				result = a++;
				System.out.println(a);
			}
		}
		return result;
	}
	private static int[] relleno(int a, int b, int[] c) {
		int result = 0;
		if(a>b) {
			for(int i = 0; i< c.length; i++) {
				result = b++;
				c[i] = result;
			}
		}else {
			for(int i = 0; i< c.length; i++) {
				result = a++;
				c[i] = result;
			}
		}
		return c;
	}
	private static int[] interarray(int array2[], int inicio, int fin, int intervalo) {
		
		array2[0] = inicio;
		for(int i = 1; inicio<fin; i++) {
			inicio = inicio + intervalo;
			array2[i] = inicio;
		}
		return array2;	
	}
	private static void pinta(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	