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
		
		String nombre;
		System.out.println("¿Cual es el nombre de la playlist?:");
		nombre = scstring.nextLine();
		PlayList electro = new PlayList(nombre);
		
		int opcion = 0;
		int opcion2 = 0;
		String titulo = " ";
		String autor = " ";
		int duracion = 0;
		int posi = 0;
		
		do {
			opcion = menu(scopcion, opcion);
			System.out.println("");
			switch(opcion){
				case 1:
						caso1(titulo, autor, duracion, scstring, scint, electro);
					break;
				case 2:
						caso2(electro);
					break;
				case 3:
						caso3(electro, titulo,scstring, posi, scint, scopcion, opcion2);
					break;
				case 4:
						caso4(electro);
					break;
				case 5:
						caso5(electro);
					break;
				case 6:
						caso6(electro);
					break;
				case 7:
						caso7(posi, scint, electro);
					break;
				case 8:
						caso8(electro);
					break;
				case 9:
						caso9(posi, scint, electro);
					break;
				case 10:
						caso10(autor, scstring, electro);
					break;
				case 0:
					System.out.println("Hasta luego muchas gracias por crear con nosotro la playlist: "+ electro.getnombre());
					break;
			}
		}while(opcion != 0);
		scstring.close();
		scint.close();
		scopcion.close();
	}

	private static int menu(Scanner scopcion, int opcion){
		System.out.println("Estas con las opciones que puedes elegir");
        System.out.println("1. Añadir cancion");
        System.out.println("2. Cuantas canciones tienes");
        System.out.println("3. Encontrar cancion");
        System.out.println("4. Mostrar las canciones de la playlist");
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
	private static void mostrarPlaylist(PlayList a) {
		for (Cancion c: a.canciones) {
			System.out.println(c.toString()+".");
		}
	}
	private static void reproducirPlaylist(PlayList a) {
		for(int i = 0; i<a.canciones.size() ;i++) {
			System.out.println(a.reproducirCancion(i));
		}
	}
	private static void caso1(String titulo, String autor, int duracion, Scanner scstring, Scanner scint, PlayList a) {
		System.out.println("has seleccionado la opcion de introducir canciones: ");
		System.out.println("Introduzca el titulo de la cancion: ");
		titulo = scstring.nextLine();
		System.out.println("Introduzca el artista de la cancion: ");
		autor = scstring.nextLine();
		System.out.println("Introduzca el duracion de la cancion: ");
		duracion = scint.nextInt();
		
		a.anyadirCancion(titulo, autor, duracion);
	}
	private static void caso2(PlayList a) {
		System.out.println("has seleccionado la opcion de mostrar el total de las canciones: ");
		System.out.println("Este es el total: "+a.obtieneTotalCanciones());
	}
	private static void caso3(PlayList a, String titulo, Scanner scstring, int posi, Scanner scint, Scanner scopcion, int opcion2) {
		System.out.println("Has seleccionado la opcion de buscar un cancion, tienes\n"
				+ "dos opciones para encontrarla, por posicion de la cancion [1] "
				+ ", por titulo de la cancion [2] y salir [0]: ");
		opcion2 = scopcion.nextInt();
		switch(opcion2) {
			case 1:
				System.out.println("Has elegido buscar por posicion, introduzca la posicion "
						+ "de la cancion: ");
				posi = scint.nextInt();
				System.out.println("Esta es la cancion: "+ a.obtieneCancion(posi));
				
				break;
			case 2:
				System.out.println("Has elegido buscar por nombre de cancion, introduzca el "
						+ "titulo de la cancion: ");
				titulo = scstring.nextLine();
				System.out.println("Esta es la cancion: "
						+ a.encontrarCancionPorTitulo(titulo));
			case 0:
				break;
		}
	}
	private static void caso4(PlayList a) {
		System.out.println("Has seleccionado la opcion de mostrar todas las canciones de la playlist:");
		System.out.println("Estas son todas la canciones: ");
		mostrarPlaylist(a);
	}
	private static void caso5(PlayList a) {
		System.out.println("Has seleccionado la opcion de saber el total de "
				+ "la duracion de la playlist.");
		System.out.println("Esta es la duracion de la playlist: " + a.totalDuracionPlaylist());
	}
	private static void caso6(PlayList a) {
		System.out.println("Has seleccionado la opcion reproducir toda la playlist, ahora se reproducira: ");
			if(a.canciones.size() >0) {
				reproducirPlaylist(a);
			}else {
				System.out.println("La playlist no tiene canciones.");
			}
	}
	private static void caso7(int posi, Scanner scint, PlayList a) {
		System.out.println("Has seleccionado la opcion de reproducir un cancion, "
				+ "introduce la posicion para reproducirla: ");
				posi = scint.nextInt();
				System.out.println("Esta es la cancion: "+ a.reproducirCancion(posi));
	}
	private static void caso8(PlayList a) {
		System.out.println("Has seleccionado la opcion de limpiar la playlist: ");
		System.out.println("Se limpiara la playlist.");
		a.limpiarPlaylist();
	}
	private static void caso9(int posi, Scanner scint, PlayList a) {
		System.out.println("Has seleccionado la opcion de eliminar una cancion, "
				+ "para ello necesito la posicion de la cancion: ");
		posi = scint.nextInt();
		a.eliminarCancion(posi);
		System.out.println("La cancion se ha borrado.");
	}	
	private static void caso10(String autor, Scanner scstring, PlayList a) {
		System.out.println("Has seleccionado buscar las canciones del artista, "
				+ "introduzca el artista del que quiere buscar las canciones: ");
		autor = scstring.nextLine();
		for (Cancion c: a.encontrarCancionesPorArtista(autor)) {
			System.out.println("Estas son las canciones: "+ c.toString());
		}
	}
}
