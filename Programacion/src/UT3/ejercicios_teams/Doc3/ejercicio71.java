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

		int tabla[][]=new int[3][3];
        int tabla2[][]=new int[3][3];
        int tabla3[][]=new int[3][3];

        System.out.println("La primera tabla:");

        for(int i=0; i<tabla.length; i++) {
            tabla[0][i]=i+1;
            tabla[i][0]=tabla[0][i];
        }

        for(int i=0; i<tabla.length; i++) {
            System.out.printf("%d\t",tabla[i][0]);
            for(int j=1; j<tabla.length; j++) {
                tabla[i][j]=tabla[0][j]*(i+1);
                System.out.printf("%d\t",tabla[i][j]);
            }
            System.out.println("");
        }

        System.out.println("La segunda tabla:");

        for(int i=0; i<tabla2.length; i++) {
            tabla2[0][i]=i+1;
            tabla2[i][0]=tabla[0][i];
        }

        for(int i=0; i<tabla2.length; i++) {
            System.out.printf("%d\t",tabla2[i][0]);
            for(int j=1; j<tabla2.length; j++) {
                tabla2[i][j]=tabla2[0][j]*(i+1);
                System.out.printf("%d\t",tabla2[i][j]);
            }
            System.out.println("");
        }

        System.out.println("La tercera tabla:");

        for(int i=0; i<tabla3.length; i++) {
            for(int j=0; j<tabla3.length; j++) {
                tabla3[i][j]=tabla[i][j]+tabla2[i][j];
                System.out.printf("%d\t",tabla3[i][j]);
            }
            System.out.println("");
        }

    }

}
