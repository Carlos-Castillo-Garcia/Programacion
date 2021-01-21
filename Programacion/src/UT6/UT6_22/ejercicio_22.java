/**
 * 
 */
package UT6.UT6_22;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Creado de variables
		String sn = " ";
		
		//Llamada a contructor
		Libro libro1 = new Libro();
		
		//Asignacion de valores
		libro1.settitulo("la casa de la pradera");
		libro1.setautor("Chiquito de la calzada");
		libro1.setejemplares(10);
		libro1.setprestado(9);
		
		//Programa
		System.out.println("¿Desea prestar un libro?");
		sn = entrada.nextLine();
		if(sn != "no") {
			System.out.println(libro1.dato_ejemplares());
		}else {
			System.out.println("¿Que mas desea hacer?");
		}
		entrada.close();
	}

}
