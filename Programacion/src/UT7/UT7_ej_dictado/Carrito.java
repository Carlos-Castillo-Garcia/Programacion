/**
 * 
 */
package UT7.UT7_ej_dictado;

import java.util.ArrayList;

/**
 * @author PORTATIL 2
 *
 */
public class Carrito {

		ArrayList <ArticuloCarrito> pedido;
		float total;
		boolean confirmado;
		
		public static boolean CONFIRMADO = true;
		public static boolean PENDIENTE = false;
		
		public Carrito() {
			pedido = new ArrayList <ArticuloCarrito>();	
			total = 0;
			confirmado = PENDIENTE;
		}
		
		private float calculaTotal() {
			float acumulado = 0;
			
			for(ArticuloCarrito ac: this.pedido) {
				acumulado = ac.elemento.getPrecio()*ac.cantidad;
			}
			
			return acumulado;
		}
		
		public void addArticulo(Articulo articulo, int cantidad) {
			boolean found = false;
			
			for(ArticuloCarrito ac : pedido) {
				if(ac.elemento.equals(articulo)) {
					ac.cantidad += cantidad;
					found = true;
				}
			}
			if(!found) {
				ArticuloCarrito nuevo = new ArticuloCarrito(articulo, cantidad);
				pedido.add(nuevo);
			}
			this.total = calculaTotal();
		}
}










