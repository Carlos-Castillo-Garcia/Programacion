/**
 * 
 */
package UT7.UT7_25;

import java.util.Scanner;

/**
 * @author Manuel
 *
 */
public class ejercicio_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scstring = new Scanner(System.in);
		Scanner scint = new Scanner(System.in);
		Scanner scopcion = new Scanner(System.in);
		
		
		PlayList electro = new PlayList();/*Comprobar esto con Nayra*/
		int opcion = 0;
		String titulo;
		String autor;
		int duracion;
		
		do {
			opcion = menu(scopcion, opcion);
			System.out.println("");
			switch(opcion){
				case 1:
						System.out.println("has seleccionado la opcion de introducir canciones: ");
						System.out.println("Introduzca el titulo de la cancion: ");
						titulo = scstring.nextLine();
						System.out.println("Introduzca el titulo de la cancion: ");
						autor = scstring.nextLine();
						System.out.println("Introduzca el titulo de la cancion: ");
						duracion = scint.nextInt();
						
						electro.anyadirCancion(titulo, autor, duracion);
					break;
					
				case 2:
						
					break;
					
				case 3:
					
					break;
					
				case 4:
					
					break;
					
				case 5:
					
					break;
					
				case 6:
					
					break;
					
				case 7:
					
					break;
					
				case 8:
					
					break;
					
				case 9:
					
					break;
					
				case 10:
					
					break;
					
				case 0:
					
					break;
			}
		}while(opcion != 0);
		
	}

	private static int menu(Scanner scopcion, int opcion){
		System.out.println("Estas con las opciones que puedes elegir");
        System.out.println("1. Añadir cancion");
        System.out.println("2. Cuantas canciones tienes");
        System.out.println("3. Encontrar cancion");
        System.out.println("4. Costrar las canciones de la playlist");
        System.out.println("5. Mostrar la duracion de la playlist");
        System.out.println("6. Reproducir toda la playlist");
        System.out.println("7. Reproducir una cancion de la playlist");
        System.out.println("8. Limpiar la playlist");
        System.out.println("9. Eliminar una cancion de la playlist");
        System.out.println("10. Encontrar toda las canciones de un artista");
        System.out.println("0. Salir");
        System.out.println("¿Cual es tu opcion?");
		opcion = scopcion.nextInt();
		
		return opcion;
	}
	
//	private static void mostrarPlaylist(PlayList a) {
//		for (PlayList c: a.canciones) {
//			System.out.println(c.toString()+".");
//		}
//	}
	private static void reproducirPlaylist() {
		
	}
}
