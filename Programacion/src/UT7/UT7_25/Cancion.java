/**
 * 
 */
package UT7.UT7_25;

/**
 * @author Manuel
 *
 */
public class Cancion {
	/**
	 * Atributos de la clase cancion
	 */
	private String titulo;
	private String artista;
	private int duracion;
	/**
	 * Constructor por defecto o vacio
	 */
	public Cancion(){
	}
	/**
	 * Constructor con parametros
	 * @param titulo de la cancion
	 * @param artista de la cancion
	 * @param duracion de la cancion
	 */
	public Cancion(String titulo, String artista, int duracion) {
		settitulo(titulo);
		setartista(artista);
		setduracion(duracion);
	}
	/**
	 * Getter de titulo	
	 * @return retorna el titulo de la cancion
	 */
	public String gettitulo() {
		return titulo;
	}
	/**
	 * Getter de artista	
	 * @return retorna el artista de la cancion
	 */
	public String getartista() {
		return artista;
	}
	/**
	 * Getter de duracion	
	 * @return retorna la duracion de la cancion
	 */
	public int getduracion() {
		return duracion;
	}
	/**
	 * Setter de titulo
	 * @param titulo de la cancion
	 */
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Setter de autor
	 * @param autor de la cancion
	 */
	public void setartista(String artista) {
		this.artista = artista;
	}
	/**
	 * Setter de duracion
	 * @param duracion de la cancion
	 */
	public void setduracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * metodo toString para imprimir los atributos de los objetos de cancion
	 */
	@Override
	public String toString() {
		return gettitulo() + "-" + getartista()+" (" + getduracion()+" minutos)";
	}
	/**
	 * Funcion para imprimir "reproduciendo" y la cancion que se esta reproduciendo
	 * @return devuelve una frase impresa por pantalla
	 */
	public String reproduciendo() {
		return "Reproduciendo. " + toString();
	}
}
