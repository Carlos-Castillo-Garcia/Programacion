/**
 * 
 */
package UT6.UT6_20;

//import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona yo = new Persona();

	
		//pedida de todas las variables 
		yo.setnombre("Carlos IsMa");
		yo.setapellidos("Castillo Garcia");
		yo.setanio(2001);
		yo.setmes(6);
		yo.setdia(1);
		yo.setsexo('M');
		
		//mostrado de las variables
//		System.out.println(yo.getnombre());
//		System.out.println(yo.getapellidos());
//		System.out.println(yo.getanio());
//		System.out.println(yo.getmes());
//		System.out.println(yo.getdia());
//		System.out.println(yo.getsexo());
		
		System.out.println(yo.saludar());
		System.out.println(yo.mostrarEdad());
		
	}
}
