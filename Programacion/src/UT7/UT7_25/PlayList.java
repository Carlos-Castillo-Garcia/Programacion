/**
 * 
 */
package UT7.UT7_25;
import java.util.ArrayList;
/**
 * @author Manuel
 *
 */
public class PlayList {

	ArrayList <Cancion> canciones;
	private String nombre;
	
	public PlayList() {
		canciones = new ArrayList<Cancion>();
	}
	public PlayList(String nombre) {
		this.nombre = nombre;
		canciones = new ArrayList<Cancion>();
	}
	
	public void anyadirCancion(String titulo, String autor, int duracion) {
		canciones.add(new Cancion (titulo, autor, duracion));
	}
	public Cancion obtieneCancion(int posicion) {
		return canciones.get(posicion);
	}
	public int obtieneTotalCanciones() {
		return canciones.size();
	}
	public int totalDuracionPlaylist() {
		int duracion = 0;
		for (Cancion c: canciones) {
			duracion = duracion + c.getduracion();
		}
		return duracion;
	}
	public void reproducirCancion(int posicion) {
		canciones.get(posicion).reproduciendo();
	}
	public void limpiarPlaylist() {
//		for (Cancion c: canciones) {
//			canciones.remove(c);
//		}
		canciones.clear();
	}
	public boolean eliminarCancion(int posicion) {
		
		if(canciones.size()>0) {
			if(posicion <= canciones.size()) {
				canciones.remove(posicion);
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	public Cancion encontrarCancionPorTitulo(String nombre) {
		
		
	}
	public ArrayList <Cancion> encontrarCancionesPorArtista(String artista){
		
	}
}
