/**
 * 
 */
package UT6.UT6_22;

/**
 * @author CARLOS
 * @return primera clase creada 100% por el programador para el entendimiento de las clases. 
 */
public class Libro {
	/**
		 * @return atributo con el nombre del titulo
		 */
		private String titulo;
		/**
		 * @return atributo con el nombre del autor
		 */
		private String autor;
		/**
		 * @return atributo con el numero de ejemplares
		 */
		private int ejemplares;
		/**
		 * @return atributo con el numero de ejemplares prestados
		 */
		private int prestados;
		
	//Constructores
	/**
		 * @category constructor por defecto o constructor vacio.
		 */
		public Libro() {
			
		}
		/**
		 * Constructor con parametros
		 * @param titulo del constructor con parametros
		 * @param autor del constructor con parametros
		 * @param ejemeplares del constructor con parametros
		 * @param ejemlares prestados del constructor con parametros
		 */
		public Libro(String t, String a, int e, int ep) {
			settitulo(t);
			setautor(a);
			setejemplares(e);
			setprestado(ep);
		}

	//Metodos usados para el correcto funcionamiento del programa

			/**
			 * @return Metodo getter para sacar el atributo titulo
			 */
			public String gettitulo() {
				return titulo;
			}
			/** 
			 * @return Metodo getter para sacar el atributo autor
			 */
			public String getautor() {
				return autor;
			}
			/**
			 * @return Metodo getter para sacar el atributo ejemplares
			 */
			public int getejemplares() {
				return ejemplares;
			}
			/**
			 * @return Metodo getter para sacar el atributo prestados
			 */
			public int getprestados() {
				return prestados;
			}
			
			/**
			 * @param Titulo del libro
			 * @return Metodo setter para sacar el atributo titulo
			 */
			public void settitulo(String t) {
				this.titulo = t;
			}
			/**
			 * @param Autor del libro
			 * @return Metodo setter para sacar el atributo autor
			 */
			public void setautor(String a) {
				this.autor = a;
			}
			/**
			 * @param Ejemplares del libro
			 * @return Metodo setter para sacar el atributo ejemplares
			 */
			public void setejemplares(int e) {
				this.ejemplares = e;
			}
			/**
			 * @param Ejemlares prestados del libro
			 * @return Metodo setter para sacar el atributo prestados
			 */
			public void setprestado(int p) {
				this.prestados = p;
			}
			
			/**
			 * @return  Devuelve true en caso de que se haya podido prestar un libro y devuelve false en caso de que no se haya podido prestar un libro
			 */
			public boolean prestamo(){
				boolean dp = false;
				
				if(prestados < ejemplares) {
					dp = true;
					prestados++;
				}else {
					dp = false;
					
				}
				return dp;
			}
			/**
			 * @return Devuelve true en caso de que se haya podido devolver un libro y devuelve false en caso de que no se haya podido devolver un libro
			 */
			public boolean devolucion(){
				boolean dp = false;
				
				if(prestados > 0) {
					dp = true;
					prestados--;
				}else {
					dp = false;
					
				}
				return dp;
			}
			/**
			 * @return Devuelve todos los atributos de los objetos que lo usen
			 */
			public String ToString() {
				return "\n\nTitulo del Libro: "+gettitulo()+"\nAutor del libro: "+getautor()+"\nEjemplares: "+getejemplares()+"\nEjemplares prestados:"+getprestados()+"\n\n\n";
			}
}