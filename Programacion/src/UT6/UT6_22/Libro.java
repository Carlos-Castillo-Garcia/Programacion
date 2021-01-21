/**
 * 
 */
package UT6.UT6_22;

/**
 * @author CARLOS
 *
 */
public class Libro {
	//Atributos
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestado;
	
	//Constructores
	public Libro() {
		
	}
	
	public Libro(String t, String a, int e, int ep) {
		
		this.titulo = t;
		this.autor = a;
		this.ejemplares = e;
		this.prestado = ep;
		
	}
	//Metodos
	
		//Getters
			public String gettitulo() {
				return titulo;
			}
			public String getautor() {
				return autor;
			}
			public int ejemplares() {
				return ejemplares;
			}
			public int prestado() {
				return prestado;
			}
		
		//Setters
			public void settitulo() {
				
			}
			public void setautor() {
				
			}
			public void setejemplares() {
				
			}
			public void setprestado() {
				
			}
			
		//Funciones
			public void incremento() {
				prestado++;
			}
			
			public void p_ejemplares() {
				if(ejemplares > 0) {
					prestado++;
				}
			}
			public void operacion() {
				boolean o = false;
				if() {
					
				}
				
			}
			public int devolucion(int p) {
				
			}
}
