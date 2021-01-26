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
		String titulo, autor;
		int ejemplares;

		//Llamada a contructor
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		Libro libro3 = new Libro();
		
		//Ejercicio 1
		libro1.settitulo("la casa de la pradera");
		libro1.setautor("Chiquito de la calzada");
		libro1.setejemplares(10);
		libro1.setprestado(9);

		//Ejercicio 2
		libro2.settitulo("el ultimo mohicano");
		libro2.setautor("Chiquito de la calzada");
		libro2.setejemplares(5);
		libro2.setprestado(4);

		//Ejercicio 3
		if(libro1.prestamo() == true) {
			System.out.println("El prestamo se ha completado \n\n");
		}else {
			System.out.println("El prestamo no se ha completado \n\n");
		}

		//Ejercicio 4
		System.out.println("El numero de ejemplares prestados es: " +libro1.getprestados()+"\n\n");

		//Ejercicio 5
		if(libro1.prestamo() == true) {
			System.out.println("El prestamo se ha completado");
			System.out.println("El numero de ejemplares prestados es: " +libro1.getprestados()+"\n\n");
		}else {
			System.out.println("El prestamo no se ha completado");
			System.out.println("El numero de ejemplares prestados es: " +libro1.getprestados()+"\n\n");
		}

		//Ejercicio 6
		if(libro1.devolucion() == true) {
			System.out.println("La devolucion se ha completado \n\n");
		}else {
			System.out.println("La devolucion no se ha completado \n\n");
		}

		//Ejecicio 7
		libro1.setprestado(0);

		//ejercicio 8
		if(libro1.devolucion() == true){
			System.out.println("La devolucion se ha completado");
			System.out.println("El numero de ejemplares prestados es: " +libro1.getprestados()+"\n\n");
		}else {
			System.out.println("La devolucion no se ha completado");
			System.out.println("El numero de ejemplares prestados es: " +libro1.getprestados()+"\n\n");
		}

		//Ejercicio 9
		System.out.println(libro2.ToString());

		//Ejercicio 10
		System.out.print("Introduce titulo: ");
		titulo = entrada.nextLine();
		System.out.print("Introduce autor: ");
		autor = entrada.nextLine();
		System.out.print("Numero de ejemplares: ");
		ejemplares = entrada.nextInt();
		libro3.settitulo(titulo);
		libro3.setautor(autor);
		libro3.setejemplares(ejemplares);
		libro3.setprestado(0);
		System.out.println(libro3.ToString());

		entrada.close();
	}
}
