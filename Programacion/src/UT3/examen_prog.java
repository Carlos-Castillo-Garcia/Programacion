/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Carlos
 *
 */
public class examen_prog {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		//Creado de variable 
		boolean taquillas[] = new boolean[10];
		int opcion;
		int selectaquilla = 0;

		//Cambio de valores del array
		for(int i = 0; i<taquillas.length; i++) {
			taquillas[i] = true;
		}

		do {
			System.out.println("Seleccione una opcion (Abrir taquilla[1], Cerrar taquilla[2], Salir[0]): ");
			opcion = entrada.nextInt();
			
			switch (opcion){
				
				case 1:
			//Caso de apertura de taquillas
						for(int i = 0, contador = 0; i < taquillas.length; i++, contador++) {
							if(taquillas[i] == false) {
								System.out.println("Taquilla numero "+ contador + " esta cerrada");
							}else if(taquillas[i] == true) {
								System.out.println("Taquilla numero "+ contador + " esta abierta");	
							}
						}
						System.out.println("Introduzca la taquilla que quiere cerrar: ");
						selectaquilla = entrada.nextInt();
							if(taquillas[selectaquilla] == true) {
								taquillas[selectaquilla] = false;
								System.out.println("La taquilla numero " + selectaquilla + " se ha cerrado.\n");
							}else if(taquillas[selectaquilla] == false){
								System.out.println("La taquilla ya estaba cerrada.\n");
							}
							break;
				case 2:
			//Caso de cierre de taquillas
					for(int i = 0, contador = 0; i < taquillas.length; i++, contador++) {
						if(taquillas[i] == false) {
							System.out.println("Taquilla numero "+contador + " esta cerrada");
						}else if(taquillas[i] == true) {
							System.out.println("Taquilla numero "+contador + " esta abierta");	
						}
					}
					System.out.println("Introduzca la taquilla que quiere abrir: ");
					selectaquilla = entrada.nextInt();

					if(taquillas[selectaquilla] == false) {
						taquillas[selectaquilla] = true;
						System.out.println("La taquilla numero " + selectaquilla + " se ha abierto.\n");
					}else if(taquillas[selectaquilla] == true){
						System.out.println("La taquilla ya estaba abierta.\n");
					}
						break;
						
				case 0:
			//Caso de salida del programa
					break;
			}
			
		}while(opcion != 0);
		entrada.close();
	}
}
