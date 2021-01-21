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
			
		//Funciones
			public void prestamo() {
				prestado++;
			}
			public boolean prestamo(int p){
				boolean dp = false;
				
				if(prestado < 10) {
					dp = true;
					prestado++;
				}else {
					dp = false;
					
				}
				return dp;
			}
			public void devolucion(String c) {
				c = "no";
				if(c != "no") {
					prestado--;
				}
			}
			public boolean devolver_p(){
				boolean dp = false;
				
				if(prestado > 0) {
					dp = true;
					prestado--;
				}else {
					dp = false;
					
				}
				return dp;
			}
			public int ejem_restantes() {
				int rest = getejemplares() - getprestado();
				return rest;
			}
			public String titulos() {
				return "Estos son los libros que hay en estos momentos:"+ gettitulo();
			}
			public String autor() {
				return "Estos son los autores que hay en estos momentos:"+ getautor();
			}
			public String dato_ejemplares() {
				return "Estos son los ejemplares que hay en estos momentos:" + ejem_restantes() + ".";
			}
}












