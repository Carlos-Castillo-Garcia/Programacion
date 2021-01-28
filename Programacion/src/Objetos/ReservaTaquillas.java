/**
 * 
 */
package Objetos;

/**
 * @author CARLOS
 *
 */
public class ReservaTaquillas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taquilla[] taquillas = new Taquilla[10];
		
		for(int i = 0; i < taquillas.length;i++) {
			taquillas[i] = new Taquilla(i+1,"Sin asignar", false);
		}
		System.out.println(taquillas[0].getnumero());
		System.out.println(taquillas[3].getnumero());
		System.out.println(taquillas[9].getnumero());
		System.out.println(taquillas[2].getcodsocio());
		System.out.println("La taquilla 4 esta: "+taquillas[4].getcerrada());

		
		if(!taquillas[4].getcerrada()) {
			taquillas[4].setcerrada(true);
		}
		System.out.println("La taquilla 4 esta: "+taquillas[4].getcerrada());
		System.out.println(taquillas[4]);
		
	}

}
