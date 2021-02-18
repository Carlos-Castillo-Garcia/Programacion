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
		Carrito carro = new Carrito();
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
							+ " el codigo del producto\n");
					comprar(catalogo, carro, scstring, scint);
					break;
				case 3:
					System.out.println("Has elegido la opcion de confirmas la compra de productos.\n");
					System.out.println(carro.mostarcarrito());
					System.out.println("¿Desea confirmar el carrito? (si)(no)");
					String sctemp = scstring.nextLine();
					if(sctemp.equals("si")) {
						System.out.println(carro.confirmacion());
						modifstock(catalogo, carro);
						mostrarCatalogo(catalogo);
					}else{
						System.out.println("Si desea seguir comprando marque la opcion 2.\n");
					}
					break;
				case 4:
					System.out.println("Muchas gracias por utilizar esta tienda.");
					break;
				default:
					System.out.println("Has introducido la opcion incorrecta, vuelva a introducirla.");
					break;
			}
		}while(opcion != 4);
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
	private static void comprar(ArrayList<Articulo> c, Carrito ca, Scanner sctexto,Scanner scint){
		String opsalida = " ";
		Articulo insertar = new Articulo(); 
		mostrarCatalogo(c);
		int m = 0;
		do {
			System.out.println("Introduzca el codigo del producto:");
			String tempcodigo = sctexto.nextLine();
			insertar = buscarporcodigo(c, tempcodigo);
			if(insertar != null) {
				do {
				System.out.println("Introduzca la cantidad del producto que desea comprar: ");
				int tempcantidad = scint.nextInt();
				if(insertar.disponible(tempcantidad)) {
					System.out.println("\nEl articulo se a introducido al carrito.");
					ca.addArticulo(insertar, tempcantidad);
					m = 1;
				}else {
					System.out.println("No hay tantas existencias, porfavor pida una cantidad distinta.");
				}
				}while(m != 1);
			}else {
				System.out.println("El producto no esta en la lista.");
			}
			System.out.println("\n¿Desea salir de comprar y confirmar el pago del carrito?(si)(no)");
			opsalida = Metodosalir.salir(sctexto);
		}while(opsalida.equals("no"));

	}
//	private static void aumentarCodigoArticulo() {
//	
//}
	private static void modifstock(ArrayList<Articulo> c, Carrito carro) {
		int pos;
		for(ArticuloCarrito ac: carro.pedido) {
			pos = buscarporcodigomod(c, ac.elemento.getCodigo());
			if(pos >- 1){
				c.get(pos).ajustarstock(-1 * ac.cantidad);
			}
		}
	}
	private static int buscarporcodigomod(ArrayList <Articulo> catalog, String codigo) {
		boolean encontrado = false;
		int largo = catalog.size();
		int i = 0;

		while(i<largo && !(encontrado)){
			if(catalog.get(i).getCodigo().equals(codigo)){
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return i;
		}else {
			return -1;
		}
	}
	private static Articulo buscarporcodigo(ArrayList <Articulo> catalog, String codigo) {
		boolean encontrado = false;
		int largo = catalog.size();
		int i = 0;
		Articulo a = null;
		while(i<largo && !(encontrado)){
			if(catalog.get(i).getCodigo().equals(codigo)){
				encontrado = true;
				a = catalog.get(i);
			}else {
				i++;
			}
		}
		return a; 
		
	}
}





