/**
 * 
 */
package UT3;

import java.util.Scanner;
/**
 * @author CARLOS
 *	ejercicio semanal dos
 */
public class Semana2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		//Declaro variale entera opcion
		int opcion;
		
				
		do{
					
					System.out.print("Esto es un menu para mejorar el estado de animo de las personas \n");
					System.out.print("\n\n");
					System.out.print("Elija una de estas opciones \n");
					System.out.print("1. Feliz \n");
					System.out.print("2. Triste \n");
					System.out.print("3. Enfadado \n");
					System.out.print("4. Serio\n");
					System.out.print("5. Aburrido \n");
					System.out.print("6. Cerrar programa \n");
					opcion = entrada.nextInt();
					System.out.print("\n\n");
					
						
					
						switch(opcion){
		
							case 1:
								System.out.print("Para mejorar tu estado de animo te recomiendo estas canciones:\n");
								System.out.print("El aire de la Calles \n");
								System.out.print("Roses \n");
								System.out.print("Me alegra haberte ayudado, si quieres ver otras opciones elige una del menu.\n\n");
								break;
							
							case 2:
								System.out.print("Para alegrarte un poco el dia estas canciones te ayudaran \n");
								System.out.print("Stressed Out de Twenty One Pilots\n");
								System.out.print("Happy de Pharrell Williams");
								System.out.print("Me alegra haberte ayudado, si quieres ver otras opciones elige una del menu.\n\n");
								break;
							
							case 3:
								System.out.print("Se que tienes ganas de pegarle a algo o a algien pero es mejor que no lo hagas, nunca sale bien.\n Mejor escucha estas canciones:\n\n");
								System.out.print("Bodega Grapes de Cloudchord, G Mills \n");
								System.out.print("Path of the wind de aekasora \n");
								System.out.print("Faidherbe Square de Proleter \n\n");
								System.out.print("Me alegra haberte ayudado, si quieres ver otras opciones elige una del menu.\n\n");
								break;
								
							case 4:
								System.out.print("Con ese estado de animo solo hay una forma de mejorarlo, y es haciendote chistes, comencemos: \n\n\n");
								System.out.print("Era un hombre tan vago, que cuando se murio sus amigos pusieron la siguiente inscripcion en su tumba: Aqui continua descansando.");
								System.out.print("\n\n\n");
								System.out.print("Debido a la recesion economica actual, para ahorrar costos de energia se apagara la luz al final del tunel. Firmado: Dios");
								System.out.print("\n\n\n");				
								System.out.print("Me alegra haberte ayudado, si quieres ver otras opciones elige una del menu.\n\n");
								break;
								
							case 5:
								System.out.print("Para cambiar ese estado de animo solo hay una forma: \n");
								System.out.print("Llama a tus amigos y diles que te aburres mucho y que tienes ganas de fiesta.\n");
								System.out.print("Asique ya estas tardando en llamarlos y decirselo para que te saquen de casa, ¡¡¡¡OTAKU!!!! XDD\n\n");
								System.out.print("Me alegra haberte ayudado, si quieres ver otras opciones elige una del menu.\n\n\n");
								break;
						}
				}while(opcion !=6);
				System.out.print("Me alegra haberte ayudado, para futuros estados de animo de los cuales quieras salir ya sabes donde estoy\n ");
			
				entrada.close();
		}
	}







