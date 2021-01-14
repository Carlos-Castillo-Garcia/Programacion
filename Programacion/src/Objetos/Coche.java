/**
 * 
 */
package Objetos;

/**
 * @author CARLOS
 *
 */
public class Coche {
	
	//atributos o propiedades
	String color;
	String matricula;
	int kilometros;
	boolean reservado = false;
	
	public Coche(String color, String matricula, int km) {
		this.color = color;
		this.matricula = matricula;
		this.kilometros = km;
	}
	
	//metodos
	public boolean reservar() {
		
		return true;
	}
	
	public boolean entregar() {
		
		return true;
	}
	
	//Fin metodos
}
