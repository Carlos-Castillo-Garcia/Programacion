/**
 * 
 */
package UT6.UT6_21;

/**
 * @author CARLOS
 *
 */
public class Contador {

	//atributo privado
	private int cont;
	
	//constructor vacio
	public Contador(){}
	
	//constructor con parametros
	public Contador(int c) {
		setcont(c);
	}
	
	public Contador(Contador c1) {
		setcont(c1.getcont());
	}
	
	//Metodos
	
		//getters
		public int getcont() {
			return cont;
		}
		
		//setters
		public void setcont(int c) {
			if(c < 0) {
				c = 0;
			}
			this.cont = c;
		}

		//Funciones
			
			//funcion incremento
			public void incrementar() {
				cont++;
			}
			
			//funcion decremento y comprovacion de negativos
			public void decrementar() {
				cont--;
				
				if(cont < 0) {
					cont = 0;
				}
			}
			
	
}








