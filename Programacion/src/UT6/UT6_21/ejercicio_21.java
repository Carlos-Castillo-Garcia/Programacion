/**
 * 
 */
package UT6.UT6_21;
import java.util.ArrayList;

/**
 * @author CARLOS
 *
 */
public class ejercicio_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//valores asignados a los objetos
		Contador c1= new Contador();
		Contador c2= new Contador(6);
		Contador c3= new Contador(c2);
		
		//impresion de los valores
		System.out.println("Valor del contador 1: " + c1.getcont());
		System.out.println("Valor del contador 2: " + c2.getcont());
		System.out.println("Valor del contador 3: " + c3.getcont());
		
		//usado de funciones
		c2.incrementar();
		System.out.println("Valor del contador 2 tras incrementar: " + c2.getcont());
		c2.decrementar();
		System.out.println("Valor del contador 2 tras decrementar: " + c2.getcont());
		c3.incrementar();
		System.out.println("Valor del contador 3 tras incrementar: " + c3.getcont());
		
		ArrayList<Contador> contadores= new ArrayList<Contador>();
		contadores.add(c1);
		contadores.add(c2);
		contadores.add(c3);
		for (int i=0; i<contadores.size();i++){
			contadores.get(i).decrementar();
			System.out.println("Valor del contador " + (i+1) + " - " + contadores.get(i).getcont());
		}
	}
}
