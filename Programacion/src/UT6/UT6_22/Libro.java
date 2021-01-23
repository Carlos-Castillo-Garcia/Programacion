/**
 * 
 */
package UT6.UT6_22;

/**
 * @author CARLOS
 * @param <Scanner>
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
		
		settitulo(t);
		setautor(a);
		setejemplares(e);
		setprestado(ep);
		
	}
	
	//Metodos
	
		//Getters
			public String gettitulo() {
				return titulo;
			}
			public String getautor() {
				return autor;
			}
			public int getejemplares() {
				return ejemplares;
			}
			public int getprestado() {
				return prestado;
			}
		
		//Setters
			public void settitulo(String t) {
				if(t == "") {
					System.out.println("No ha introducido ningun libro");
				}
				this.titulo = t;
			}
			public void setautor(String a) {
				if(a == "") {
					System.out.println("No ha introducido ningun autor");
				}
				this.autor = a;
			}
			public void setejemplares(int e) {
				if(e == 0) {
					System.out.println("No hay ningun ejemplar");
				}
				this.ejemplares = e;
			}
			public void setprestado(int p) {
				if(p == 0) {
					System.out.println("No hay ningun ejemplar prestado");
				}
				this.prestado = p;
			}
			
		//Funciones para las comprovaciones
			public void prestamo() {
					prestado++;	
			}
			public boolean prestar(int p){/*Comprobante del prestamo*/
				boolean dp = false;
				
				if(p < 10) {
					dp = true;
				}else {
					dp = false;
					
				}
				return dp;
			}
			public void devolucion() {
					prestado--;
			}
			public boolean devolver_p(int p){/*Comprobante de la devolucion*/
				boolean dp = false;
				
				if(p > 0) {
					dp = true;
				}else {
					dp = false;
					
				}
				return dp;
			}
			
		//Funciones para calculo de datos
			public int ejem_restantes() {
				int rest = getejemplares() - getprestado();
				return rest;
			}
			
		//Funciones para sacar datos
			public String dato_titulos() {
				return "Estos son los libros que hay en estos momentos: "+ gettitulo();
			}
			public String dato_autor() {
				return "Estos son los autores que hay en estos momentos: "+ getautor();
			}
			public String dato_ejemplares() {
				return "Estos son los ejemplares que hay en estos momentos: " + gettitulo() + " estos son los disponibles para prestar " + ejem_restantes() + ".";
			}
			public String dato_devoluciones() {
				return "Estos son los libros que tienes para devolver: "+ gettitulo();
			}
}












