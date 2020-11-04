/**
 * 
 */
package UT3.ejercicios_teams.Doc2;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class ejercicio21 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int numero_usuario;
		int suma_de_numeros;
		int aux;
		int total_suma = 0;
		int mayor = 0;
		int menor = 0;
		float contador = 0;
		float media;


		System.out.println("Para parar este programa de suma tiene que poner un 0");

		do{		
						
			
			System.out.print("Introduzca un numero: ");
			numero_usuario = entrada.nextInt();
			aux = numero_usuario;
			suma_de_numeros = aux + total_suma;
			total_suma = suma_de_numeros;
			
			if(numero_usuario == 0) {
				System.out.println("Se cierra el programa");
			}else {
				contador = contador +1;

		          if(contador == 1) {
					  mayor = numero_usuario;
		          }else {
		        	  if(numero_usuario > mayor){
							mayor = numero_usuario;
						}
		          }
		          
		          if(contador == 1) {
					  menor = numero_usuario;
			      }else {
		          if(numero_usuario < menor ){
						menor = numero_usuario;
					}
			      }
			}

		}while(numero_usuario != 0);
		System.out.print("\n\n\n");
		System.out.printf("el numero de registros introducidos es: %d \n", (int)contador);
		System.out.println("Esta es la suma de los numeros introducidos: " +suma_de_numeros );
		System.out.println("el numero mayor introducido es:" +mayor);
		System.out.println("el numero menor introducido es:" +menor);
		media = suma_de_numeros / contador;
		System.out.printf("Esta es la media: %5.2f ", media);
		entrada.close();
	}}
		
	


