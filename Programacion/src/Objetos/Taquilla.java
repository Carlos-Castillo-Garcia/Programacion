/**
 * 
 */
package Objetos;

/**
 * @author CARLOS
 *
 */
public class Taquilla {
	private int numero;
	private String codsocio;
	private boolean cerrada;
	
	public Taquilla() {
		
	};
	
	public Taquilla(int numero, String socio, boolean cerrada) {
		this.numero = numero;
		this.codsocio = socio;
		this.cerrada = cerrada;
	}

	public int getnumero() {
		return numero;
	}
	public String getcodsocio() {
		return codsocio;
	}
	public boolean getcerrada() {
		return cerrada;
	}
	public void setnumero(int numero) {
		this.numero = numero;
	}
	public void setcodsocio(String codsocio) {
		this.codsocio = codsocio;
	}
	public void setcerrada(boolean cerrada) {
		this.cerrada = cerrada;
	}
	
	@Override
	public String toString() {
		String estado = "abierta";
		if(this.cerrada) {
			estado = "cerrada";
		}
			return "Taquilla no: " +this.numero+ 
					"\nPertenece al socio: "+this.codsocio+ 
					"\nEstado: "+this.cerrada;
				
	}
}
