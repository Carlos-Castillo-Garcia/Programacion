/**
 * 
 */
package UT3.ejercicios_teams.Doc4;

/**
 * @author CARLOS
 *
 */
public class Cilindro {
	
		//atributos
		double altura;
		double radio;
		
		public Cilindro() {
			
		}
		
		public Cilindro(double altura, double radio) {
			this.altura = altura;
			this.radio = radio;
		}
		
		public static double area(double altura, double radio) {
			double area1 = (2*3.14*radio*altura)+(2*3.14*radio*2);
			return area1;
		}
		
		public static double volumen(double altura, double radio) {
			double volumen1 = (3.14*(radio*radio)*altura);
			return volumen1;
		}
}

