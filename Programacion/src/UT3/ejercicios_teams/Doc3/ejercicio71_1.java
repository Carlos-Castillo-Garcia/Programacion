/**
 * 
 */
package UT3.ejercicios_teams.Doc3;

/**
 * @author CARLOS
 *
 */
public class ejercicio71_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 

		    int[][] tabla1=new int [3][3];
	        int[][] tabla2=new int [3][3];
	        int[][] tabla3=new int [3][3];
	        
	        System.out.printf("tabla 1 \n");
	        rellena(tabla1);
	        pinta(tabla1);
	        System.out.printf("tabla 3\n");
	        rellena(tabla2);
	        pinta(tabla2);
	        multi(tabla1, tabla2, tabla3);
	        System.out.printf("tabla 3\n");
	        pinta(tabla3);

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
	    
	    private static void multi(int [][] multiplicado, int [][] multiplicador, int [][] resultado) {
	        for(int i=0; i<resultado.length; i++) {
	            for(int j=0; j<resultado.length; j++) {
	            	resultado[i][j]=multiplicado[i][j]*multiplicador[i][j];
	            }
	        }
	    	
	    }
	}
