/**
 * 
 */
package UT7.UT7_ej_dictado;

import java.util.ArrayList;
import java.util.Scanner;
import Plantillas.Metodosalir;

/**
 * @author PORTATIL 2
 *
 */
public class Tienda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scstring = new Scanner(System.in);
		Scanner scint = new Scanner(System.in);
		Scanner scopcion = new Scanner(System.in);
		
		int opcion = 0;
		Carrito carro;
		ArrayList <Articulo> catalogo = new ArrayList <Articulo>();
		inicializarcatalogo(catalogo);
		
		
		
		do {
			System.out.println("Esto es el menu de la tienda, tiene diferentes opciones:");
			System.out.println("1. Añadir un articulo al catalogo");
			System.out.println("2. Comprar un producto.");
			System.out.println("3. Comfirmar la compra de los productos.");
			System.out.println("4. Salir del la tienda.");
			opcion = scopcion.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Has elegido la opcion de añadir un articulo, para ello va a ser necesario insertar ciertos datos: ");
					addArticuloCatalogo(catalogo, scstring, scint);
					mostrarCatalogo(catalogo);
					break;
				case 2:
					System.out.println("Has elegido la opcion de comprar productos, para seleccionar los productos es necesario utilizar"
							+ " el codigo del producto");


					break;
				case 3:
					System.out.println("Has elegido la opcion de confirmas la compra de productos.");
					break;
				case 0:
					System.out.println("Muchas gracias por utilizar esta tienda.");
					break;
				default:
					System.out.println("Has introducido la opcion incorrecta, vuelva a introducirla.");
					break;
			}
		}while(opcion == 0);
		scstring.close();
		scint.close();
		scopcion.close();
	}
	private static void inicializarcatalogo(ArrayList <Articulo> c) {
		c.add(new Articulo("0001", "Monitor", 200.00F, 10));
		c.add(new Articulo("0002", "Teclado", 30.00F, 40));
		c.add(new Articulo("0003", "Raton", 25.99F, 100));
		c.add(new Articulo("0004", "RJ45-5M-Cat 6", 10.00F, 25));
	}
	private static void addArticuloCatalogo(ArrayList <Articulo> c, Scanner texto, Scanner ints) {
		System.out.println("Introduce el codigo del articulo:");
		String codigo = texto.nextLine();
		System.out.println("Introduce el nombre del articulo:");
		String nombre  = texto.nextLine();
		System.out.println("Introduce el precio del articulo:");
		float precio = ints.nextFloat();
		System.out.println("Introduce el stock del articulo:");
		int stock = ints.nextInt();
		
		c.add(new Articulo(codigo, nombre, precio, stock));
	}
	private static void mostrarCatalogo(ArrayList <Articulo> c) {
		for (Articulo a : c) {
			System.out.println(a);
		}
	}
//	private static void aumentarCodigoArticulo() {
//		
//	}
	private static void comprar(ArrayList<Articulo> c, Carrito ca, Scanner sctexto,Scanner scint){
		int opsalida = 0;
		do {
			System.out.println("Introduzca el codigo del producto:");
			String temp = sctexto.nextLine();
			for(int i = 0; i<c.size(); i++) {
				
			}
		opsalida = Metodosalir.salir(scint);
		
		}while(opsalida == 0);
	}

}





