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
	/**
	 * Atributos de la clase playlist.
	 */
	ArrayList <Cancion> canciones;
	private String nombre;
	/**
	 * Este es el constructor vacio.
	 */
	public PlayList() {
		canciones = new ArrayList<Cancion>();
	}
	/**
	 * Este es el constrctor con parametros
	 * @param nombre de la playlist
	 */
	public PlayList(String nombre) {
		this.nombre = nombre;
		canciones = new ArrayList<Cancion>();
	}
	/**
	 * getter del nombre de la playlist.
	 */
	public String getnombre() {
		return nombre;
	}
	/**
	 * Setter del nombre de la playlist
	 */
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Funcion para añadir canciones a la playlist.
	 * @param titulo de la cancion
	 * @param autor de la cancion
	 * @param duracion de la cancion
	 */
	public void anyadirCancion(String titulo, String autor, int duracion) {
		canciones.add(new Cancion (titulo, autor, duracion));
	}
	/**
	 * Funcion obtiene la cancion segun la posicion.
	 * @param posicion de la cancion en el arraylist.
	 * @return devuelve los parametros de la cancion.
	 */
	public Cancion obtieneCancion(int posicion) {
		return canciones.get(posicion);
	}
	/**
	 * Funcio para obtener el numero total de canciones que tiene la playlist.
	 * @return devuelve el numero de canciones.
	 */
	public int obtieneTotalCanciones() {
		return canciones.size();
	}
	/**
	 * Funcion que calcula la duracion total de la playlist.
	 * @return devuelve la duracion.
	 */
	public int totalDuracionPlaylist() {
		int duracion = 0;
		for (Cancion c: canciones) {
			duracion = duracion + c.getduracion();
		}
		return duracion;
	}
	/**
	 * funcion para reproducir una cancion segun la posicion
	 * @param posicion de la cancion en el arraylist
	 * @return devuelve una funcion de la clase cancion
	 */
	public String reproducirCancion(int posicion) {
		return canciones.get(posicion).reproduciendo();
	}
	/**
	 * Funcion para limpiar el arraylist.
	 */
	public void limpiarPlaylist() {
		canciones.clear();
	}
	/**
	 * Funcion para eliminar una cancion seguna la posicion que se introduzca
	 * @param posicion de la cancion a eliminar en el array
	 * @return devuelve un true si se ha eliminado o false si no se ha eliminado.
	 */
	public boolean eliminarCancion(int posicion) {
		if(canciones.size()>0) {
			if(posicion <= canciones.size() && posicion >= 0) {
				canciones.remove(posicion);
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	/**
	 * Funcion para encontrar la cancion por el titulo
	 * @param nombre de la cancion
	 * @return devuelve la cancion encontrada por el titulo
	 */
	public Cancion encontrarCancionPorTitulo(String nombre) {
		int posi = 0;
		for(int i = 0; i<canciones.size(); i++) {
			if(canciones.get(i).gettitulo().equals(nombre)) {
				posi = i;
			}
		}
		return canciones.get(posi);
	}
	/**
	 * Funcion para buscar todas las canciones de un artista
	 * @param artista de la cancion 
	 * @return una lista con las canciones.
	 */
	public ArrayList <Cancion> encontrarCancionesPorArtista(String artista){
		ArrayList<Cancion> artistas = new ArrayList<Cancion>();

        for(int i=0; i < canciones.size(); i++) {
            if(canciones.get(i).getartista().equals(artista)) {
                artistas.add(new Cancion (canciones.get(i).gettitulo(), canciones.get(i).getartista(), canciones.get(i).getduracion()));
            }
        }

        return artistas;
	}
}

