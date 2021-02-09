/**
 * 
 */
package UT7.UT7_25;

/**
 * @author Manuel
 *
 */
public class Cancion {
	private String titulo;
	private String artista;
	private int duracion;
	
	public Cancion(){
	}
	public Cancion(String titulo, String artista, int duracion) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}
	
	public String gettitulo() {
		return titulo;
	}
	public String getartista() {
		return artista;
	}
	public int getduracion() {
		return duracion;
	}
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setartista(String artista) {
		this.artista = artista;
	}
	public void setduracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return gettitulo() + "-" + getartista() + getduracion();
	}
	public String reproduciendo() {
		return "Reproduciendo. " + toString();
	}
	
	
}
