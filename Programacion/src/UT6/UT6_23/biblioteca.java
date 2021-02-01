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
		Scanner varopcion = new Scanner(System.in);

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
			opcion = varopcion.nextInt();
			System.out.println("");
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
					System.out.println("\nEl libro esta dado de alta.\n");
					break;
	
				case 2:
					System.out.println("Has seleccionado la opcion de ver los libro que hay.\n\n");
					System.out.println("Estos son los libro que hay introducidos: ");
					for(int i = 0, contador = 1; i < catalogo.size(); i++, contador++) {
						System.out.println("Libro "+contador+": \n "
								+"Titulo: "
								+ catalogo.get(i).gettitulo()+".\n "
								+"Autor: "
								+ catalogo.get(i).getautor()+".\n "
								+"Tiene "+ catalogo.get(i).getejemplares()+" ejemplares.\n "
								+"De los cuales "
								+ catalogo.get(i).getprestados()+" estan prestados.\n");
					}
					break;
				case 3:
					System.out.println("Has seleccionado la opcion de borrar libros.\n ");
					System.out.println("Introduzca el titulo del libro que quiere borrar: ");
					titulo = varstring.nextLine();
					for(int i = 0; i < catalogo.size(); i++) {
						if(catalogo.get(i).gettitulo().equals(titulo)) {
							catalogo.remove(i).gettitulo().equals(titulo);
							System.out.println("El libro se ha borrado correctamente. \n");
						}else {
							System.out.println("El libro no se ha podido borrar. \n");
						}
					}
					break;
	
				case 4:
					System.out.println("Has seleccionado la opcion de hacer un prestamo.");
					System.out.println("Introduzca el titulo del libro que quiere prestar: ");
					titulo = varstring.nextLine();
					for(int i = 0; i < catalogo.size(); i++) {
						if(catalogo.get(i).gettitulo().equals(titulo)) {
							if (catalogo.get(i).getejemplares() > catalogo.get(i).getprestados()){
								catalogo.get(i).setprestado(catalogo.get(i).getprestados()+1);
								System.out.println("El libro ha sido prestado\n");
							}else {
								System.out.println("El libro no ha sido prestado\n");
							}
						}else {
							System.out.println("Este libro no existe en nuestra biblioteca\n");
						}
					}
					break;
				case 0:
					System.out.println("Hasta luego");
				}
		}while(opcion != 0);
		varstring.close();
		varint.close();
		varopcion.close();
	}
}
