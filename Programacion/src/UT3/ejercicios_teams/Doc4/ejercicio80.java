/**
 * 
 */
package UT3.ejercicios_teams.Doc4;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
//		System.out.println("Escribe un numero: ");
//		int num1 = entrada.nextInt();
//		System.out.println("Escribe un numero: ");
//		int num2 = entrada.nextInt();
		System.out.println("cuantos numero quieres: ");
		int num3 = entrada.nextInt();
		
//		int max = maximo(num1, num2);
//		
//		max = maximo2(num1, num2, num3);
		
		int[] prueba = new int[num3];
		rellena(prueba);
		pinta(prueba);
		int max = maximoarray(prueba);
		
		System.out.println("El numero mas alto es: "+max);
		
//		System.out.println(""+max);
//		System.out.println(""+max);
//		System.out.println(""+max);
//		System.out.println(""+max);
		
		entrada.close();
	}

	
//	private static int maximo(int num1, int num2) {
//		int max = num1;
//		
//		if(num1>= num2) {
//			
//			max = num1;
//		
//		}else {
//			max = num2;
//		}
//		
//		return max;
//		
//	}
//	
//	private static int maximo2(int num1, int num2, int num3) {
//		int max = num1;
//
//		if (num1 > num2 && num1 > num3) {
//			max = num1;
//		}
//		
//		if (num2 > num1 && num2 > num3) {
//			max = num2;
//		}
//		
//		if (num3 > num1 && num3 > num2) {
//			max = num3;
//		}
//
//		return max;
//
//	}

	//FUNCIÓN QUE DETERMINA EL MAYOR 

	private static int maximoarray(int[]array) { 

		int mayor = array[0]; 

		for(int i=0; i<array.length; i++) { 

			if(array[i]>mayor) { 

				mayor=array[i]; 

			} 

		} 

		return mayor; 

	}  
	
    private static void rellena(int[] tabla) {
            for(int j=0; j<tabla.length; j++) {
                tabla[j]= (int) (Math.random()*10);
            }
        }

    private static void pinta(int [] tabla) {
            for(int j=0; j<tabla.length; j++) {
                System.out.printf("%d \t",tabla[j]);
            }
            System.out.println("");
        }
    }
	

