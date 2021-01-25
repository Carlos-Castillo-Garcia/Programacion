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
		Scanner salida = new Scanner(System.in);

		//Creado de variables
		String sn = " ";
		int salir = 0;

		//Llamada a contructor
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();

		//Asignacion de valores
		libro1.settitulo("la casa de la pradera");
		libro1.setautor("Chiquito de la calzada");
		libro1.setejemplares(10);
		libro1.setprestado(9);

		libro2.settitulo("el ultimo mohicano");
		libro2.setautor("Chiquito de la calzada");
		libro2.setejemplares(5);
		libro2.setprestado(4);

		//Programa
		do {
			System.out.println("¿Que desea hacer? (prestar [P], devolver [D] o consultar disponibilidad [C]");
			sn = entrada.nextLine();

			if(sn.equals("P")){
				System.out.println(libro1.dato_titulos());
				System.out.println("");
				System.out.println("¿Desea prestar este libro?");
				sn = entrada.nextLine();
				if(sn.equals("si")){
					if(libro1.prestamo() == true) {
						System.out.println("Se ha prestado el libro, estos son los ejemplares restantes "+ libro1.ejem_restantes() + "\n");
						System.out.println("Estos son los ejemplares prestados: " + libro1.getprestado());
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
					if(libro1.devolucion() == true) {
						System.out.println("Se ha devuelto el libro, estos son los ejemplares restantes "+ libro1.ejem_restantes() + "\n");
						System.out.println("Estos son los ejemplares prestados: " + libro1.getprestado());
					}else {
						System.out.println("No hay libros para devolver, estos libros son los que quedan "+ libro1.ejem_restantes() + "\n");

					}

				}

			}else if(sn.equals("C")){
				System.out.println(libro1.dato_titulos() + " El cual tienes este numero de ejemplares " +libro2.getprestado());
				System.out.println("");	
			}
			salir(salir, salida);
		}while(salir != 0);
		entrada.close();
	}

	private static int salir(int s, Scanner salir) {
		System.out.println("¿Desea salir del programa? ( 0 = No ; 1 = Si )");  
		s = salir.nextInt();                                             

		if(s == 1) {                                                       
			System.out.println("Hasta luego");                                 
		}else {                                                                
			System.out.println("");               							   
		}
		return s;
	}
}
