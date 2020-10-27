/**
 * 
 */
package UT3.ejercicios_teams;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio15_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int dia;
		int mes;
		int año;
		int salir;

		do {
//años--------------------------------------------------------------------------------------------------------
			System.out.println("introduzca el año:");
			año = entrada.nextInt();
			
				if(año >= 1000 && año <= 3000) {
				
//meses-------------------------------------------------------------------------------------------------------
					System.out.println("introduzca el mes:");
					mes = entrada.nextInt();
				
						if(mes >=1 && mes <= 12) {
							
//dias--------------------------------------------------------------------------------------------------------
							System.out.println("introduzca el dia:");
							dia = entrada.nextInt();
							
							if(mes == 2) {
								
								if(año % 4 == 0) {
									
									if(año % 100 == 0){
										
										if(año % 400 == 0) {
											
											if(dia >=1 && dia <= 29) {
												System.out.println(año + "/" + mes + "/" + dia);
											}else {
												System.out.println("el año es bisiesto el rango esta entre 1 y 29");
											}
											
										}else {
											
											if(dia >=1 && dia <= 28) {
												System.out.println(año + "/" + mes + "/" + dia);
											}else {
												System.out.println("el año no es bisiesto el rango esta entre 1 y 28");
											}
											
										}
										
									}else {
										
										if(dia >=1 && dia <= 29) {
											System.out.println(año + "/" + mes + "/" + dia);
										}else {
											System.out.println("el año es bisiesto el rango esta entre 1 y 29");
										}
									}
									
									
								}else {
									
									if(dia >=1 && dia <= 28) {
										System.out.println(año + "/" + mes + "/" + dia);
									}else {
										System.out.println("el año no es bisiesto el rango esta entre 1 y 28");
									}
								}
								
							}else {
								
								if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
									
									if(dia >=1 && dia <= 31) {
										System.out.println(año + "/" + mes + "/" + dia);
									}else {
										System.out.println("El dia tiene que estar en el rango 1 y 31");
									}
									
								}else {
									
									if(dia >=1 && dia <= 30) {
										System.out.println(año + "/" + mes + "/" + dia);
									}else {
										System.out.println("El dia tiene que estar en el rango 1 y 30");
									}
									
								}
							}

						}else {
							System.out.println("Error el Mes tiene que ser entre 1 y 12");
						}

				}else {
					System.out.println("El año no esta dentro de rango, tienes que ser entre 1000 y 3000");
				}


//Salir-------------------------------------------------------------------------------------------------------
				System.out.println("¿Desea salir del programa? ( 0 = No ; 1 = Si )");
				salir = entrada.nextInt();
	
				if(salir == 1) {
					System.out.println("Hasta luego");
				}else {
					System.out.println("Vuelva a introducir el precio");
				}

			}while(salir != 1);
		}			
}