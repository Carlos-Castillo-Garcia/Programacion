/**
 * 
 */
package UT3.ejercicios_teams.Doc3;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String frase = new String();
		int minuscula = 0;
		int mayuscula = 0;
		int espacios = 0;
		
		System.out.println("Introduzca la frase");
		frase = entrada.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 32) {
				espacios = espacios + 1;
			}else {
				if(frase.charAt(i) >= 'a' && frase.charAt(i)<= 'z') {
					minuscula = minuscula + 1;
				}else {
					if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
						mayuscula = mayuscula + 1;
					}
				}
			}
		}
		
		System.out.println("Tiene " + espacios + " espacios; tiene " + minuscula + " minusculas y tiene " + mayuscula + " mayusculas."    );
		entrada.close();
	}

}
