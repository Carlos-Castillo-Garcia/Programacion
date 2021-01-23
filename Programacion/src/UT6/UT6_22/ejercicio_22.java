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
		int salir = 0;

		//Llamada a contructor
		Libro libro1 = new Libro();

		//Asignacion de valores
		libro1.settitulo("la casa de la pradera");
		libro1.setautor("Chiquito de la calzada");
		libro1.setejemplares(10);
		libro1.setprestado(9);

		//Programa
			System.out.println("¿Que desea hacer? (prestar [P], devolver [D] o consultar disponibilidad [C]");
			sn = entrada.nextLine();

			if(sn.equals("P")){
				System.out.println(libro1.dato_titulos());
				System.out.println("");
				System.out.println("¿Desea prestar este libro?");
				sn = entrada.nextLine();
				if(sn.equals("si")){
					if(libro1.prestar(libro1.getprestado()) == true) {
						libro1.prestamo();
						System.out.println("Se ha prestado el libro, estos son los ejemplares restantes "+ libro1.ejem_restantes() + "\n");
					}else {
						System.out.println("No hay libros para prestar, estos libros son los que quedan "+ libro1.ejem_restantes() + "\n");

					}

				}

			}else if(sn.equals("D")){
				System.out.println(libro1.dato_devoluciones());
				System.out.println("");
				System.out.println("¿Desea devolver este libro?");
				sn = entrada.nextLine();
				if(sn.equals("si")){
					if(libro1.devolver_p(libro1.getprestado()) == true) {
						libro1.devolucion();
						System.out.println("Se ha devuelto el libro, estos son los ejemplares restantes "+ libro1.ejem_restantes() + "\n");
					}else {
						System.out.println("No hay libros para devolver, estos libros son los que quedan "+ libro1.ejem_restantes() + "\n");

					}

				}

			}else if(sn.equals("C")){
				System.out.println(libro1.dato_titulos() + "\n");
				System.out.println("");	
			}
		entrada.close();
	}
}
