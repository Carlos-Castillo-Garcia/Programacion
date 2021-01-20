/**
 * 
 */
package UT3.ejercicios_teams.Doc4;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio_82 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double altura;
		double radio;
		
		System.out.println("numero");
		altura = entrada.nextDouble();
		System.out.println("numero");
		radio = entrada.nextDouble();
		
		Cilindro micilindro = new Cilindro(altura, radio);
	
		Cilindro.area(micilindro.altura, micilindro.radio);
		Cilindro.volumen(micilindro.altura, micilindro.radio);
		
		System.out.println("este es el area " + Cilindro.area(altura, radio));
		System.out.println("este es el volumen " + Cilindro.volumen(altura, radio));
		
		entrada.close();		
	}

}
