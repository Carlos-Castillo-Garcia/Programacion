/**
 * 
 */
package UT6.UT6_23;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class biblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner varstring = new Scanner(System.in);
		Scanner varint = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Libro>catalogo = new ArrayList<Libro>();
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		int opcion = 0;
		
		do {
			System.out.println("Estas son las opciones a elegir del menu:");
			System.out.println("[1] Dar de alta un libro");
			System.out.println("[2] Consultar el listado de libros");
			System.out.println("[3] Dar de baja un libro");
			System.out.println("[4] Hacer un el prestamo de un libro");
			System.out.println("[0] Salir del programa");
			opcion = varint.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Has seleccionado la opcion de dar de alta un libro, \nIntroduzca los datos del libro a continuacion: \n");
					System.out.println("Titulo del libro:");
					titulo = varstring.nextLine();
					System.out.println("\nAutor del libro:");
					autor = varstring.nextLine();
					System.out.println("\nEjemplares del libro:");
					ejemplares = varint.nextInt();
					System.out.println("\nLibros prestados:");
					prestados = varint.nextInt();
					
					if(ejemplares < prestados) {
						prestados = 0;
					}
					
					catalogo.add(new Libro(titulo, autor, ejemplares, prestados));
					System.out.println("El libro esta dado de alta.\n");
					
				case 2:
					System.out.println("Has seleccionado la opcion de ver los libro que hay:");
				case 3:
					
				case 4:
					
				case 0:
			}
		}while(opcion != 0);
		varstring.close();
		varint.close();
		entrada.close();
	}

}
