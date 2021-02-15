/**
 * 
 */
package UT7.UT7_ej_dictado;

/**
 * @author PORTATIL 2
 *
 */
public class ArticuloCarrito {

		Articulo elemento;
		int cantidad;
		
		public ArticuloCarrito() {
		}
		
		public ArticuloCarrito(Articulo elemento, int cantidad) {
			this.elemento = elemento;
			this.cantidad = cantidad;
		}
		
		@Override
		public String toString() {
			return this.elemento + "x" + this.cantidad + "\n";
		}
}
