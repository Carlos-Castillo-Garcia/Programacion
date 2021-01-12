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
		
		System.out.println("Escribe un numero: ");
		int num1 = entrada.nextInt();
		System.out.println("Escribe un numero: ");
		int num2 = entrada.nextInt();
		System.out.println("Escribe un numero: ");
		int num3 = entrada.nextInt();
		
		int max = maximo(num1, num2);
		
		max = maximo2(num1, num2, num3);
		
		//max = maximoarray(num1, num2, num3);
		
		System.out.println("El numero mas alto es: "+max);
		
//		System.out.println(""+max);
//		System.out.println(""+max);
//		System.out.println(""+max);
//		System.out.println(""+max);
		
		entrada.close();
	}

	
	private static int maximo(int num1, int num2) {
		int max = num1;
		
		if(num1>= num2) {
			
			max = num1;
		
		}else {
			max = num2;
		}
		
		return max;
		
	}
	
	private static int maximo2(int num1, int num2, int num3) {
		int max = num1;

		if (num1 > num2 && num1 > num3) {
			max = num1;
		}
		
		if (num2 > num1 && num2 > num3) {
			max = num2;
		}
		
		if (num3 > num1 && num3 > num2) {
			max = num3;
		}

		return max;

	}

	private static int maximoarray(int num1, int num2) {
		int max = num1;



		return max;

	}
	
    private static void rellena(int[][] tabla) {
        for(int i=0; i<tabla.length; i++){
            for(int j=0; j<tabla[i].length; j++) {
                tabla[i][j]= (int) (Math.random()*10);
            }
        }
    }

    private static void pinta(int [][] tabla) {
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                System.out.printf("%d \t",tabla[i][j]);
            }
            System.out.println("");
        }
    }
	
}
