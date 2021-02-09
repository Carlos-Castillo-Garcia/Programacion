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
	
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
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
	public Cancion encontrarCancionPorTitulo(String nombre) {
		int posi = 0;
		for(int i = 0; i<canciones.size(); i++) {
			if(canciones.get(i).gettitulo().equals(nombre)) {
				posi = i;
			}
		}
		return canciones.get(posi);
	}
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
