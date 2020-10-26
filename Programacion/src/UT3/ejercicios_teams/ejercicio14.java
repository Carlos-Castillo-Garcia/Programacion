/**
 * 
 */
package UT3.ejercicios_teams;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int precio;
		int opcion;
		
		

		System.out.println("Para calcular el precio del vuelo necesitamos que conteste unas cosas");
		
		System.out.println("Diganos el precio de su vuelo:");
		precio = entrada.nextInt();
		
		System.out.println("¿Quieres seleccionar el asiento? ( 0 = No ; 1 = Si)");
		opcion = entrada.nextInt();
		
		if(opcion == 1) {
			System.out.println("el precio de su vuelo se incrementara en 10€");
			precio = precio + 10;
			System.out.println("Este es el precio actual:" +precio);
			
		}else if(opcion == 0) {
			System.out.println("no se le sumara nada a su precio");
			
		}else {
			System.out.println("no he entendido su eleccion");
		}
		
		System.out.println("¿lleva equipaje? ( 0 = No ; 1 = Si)");
		opcion = entrada.nextInt();
		
		if(opcion == 1) {
			System.out.println("el precio de su vuelo se incrementara en 50€");
			precio = precio + 50;
			System.out.println("Este es el precio actual:" +precio);
			
		}else if(opcion == 0) {
			System.out.println("no se le sumara nada a su precio");
			
		}else {
			System.out.println("no he entendido su eleccion");
		}
		
		System.out.println("¿Es menor de 14 años? ( 0 = No ; 1 = Si)");
		opcion = entrada.nextInt();
		
		if(opcion == 1) {
			System.out.println("el precio de su vuelo sera la mitad y la facturacion de su maleta se cobrara a 20€");
			precio = precio - 50;
			precio = precio / 2;
			precio = precio + 20;
			System.out.println("Este es el precio actual:" +precio);
			
		}else if(opcion == 0) {
			System.out.println("no se hace nada con su precio");
			
		}else {
			System.out.println("no he entendido su eleccion");
		}
		
		System.out.println("¿quiere comida? ( 0 = No ; 1 = Si)");
		opcion = entrada.nextInt();
		
		if(opcion == 1) {
			System.out.println("el precio de su vuelo se incrementara en 20€");
			precio = precio + 20;
			System.out.println("Este es el precio actual:" +precio);
			
		}else if(opcion == 0) {
			System.out.println("no se le sumara nada a su precio");
			
		}else {
			System.out.println("no he entendido su eleccion");
		}
		
		System.out.println("¿es mayos de 60 años o tiene la trajeta de viajero frecuente? ( 0 = No ; 1 = Si)");
		opcion = entrada.nextInt();
		
		if(opcion == 1) {
			System.out.println("no se le sumara nada a su precio");
						
			
		}else if(opcion == 0) {
			System.out.println("el precio de su vuelo se incrementara en 20€");
			precio = precio + 20;
			System.out.println("Este es el precio actual:" +precio);
		}else {
			System.out.println("no he entendido su eleccion");
		}
		
		System.out.println("El precio final de su vuelo es: " +precio);
		entrada.close();
	}

}
