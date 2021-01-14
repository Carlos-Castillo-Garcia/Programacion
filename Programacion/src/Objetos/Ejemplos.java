/**
 * 
 */
package Objetos;

/**
 * @author CARLOS
 *
 */
public class Ejemplos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche micoche = new Coche("rojo", "77777AAA", 70000);
		Coche ocoche = new Coche("gris", "12345AAA", 0);
		
		System.out.println("la matricula de micoche es:"+ micoche.matricula);
		System.out.println("la matricula de micoche es:"+ ocoche.matricula);
	}

}
