/**
 * 
 */
package UT3.ejercicios_teams;
import java.util.Scanner;
/**
 * @author CARLOS
 *
 */
public class ejercicio15_5 {

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

//meses-------------------------------------------------------------------------------------------------------
			System.out.println("introduzca el mes:");
			mes = entrada.nextInt();

//dias--------------------------------------------------------------------------------------------------------
			System.out.println("introduzca el dia:");
			dia = entrada.nextInt();

//comprobaciones----------------------------------------------------------------------------------------------

//años--------------------------------------------------------------------------------------------------------
			if(año >= 1000 && año <= 3000) {
				if(año % 4 == 0 && año % 100 == 0){

//meses-------------------------------------------------------------------------------------------------------
					if(mes >=1 && mes <= 12) {
						
//febrero-----------------------------------------------------------------------------------------------------
						if(mes == 2) {
							
//Dias febrero------------------------------------------------------------------------------------------------
							if(dia >=1 && dia <= 29) {
								
//respuesta---------------------------------------------------------------------------------------------------
								System.out.println(año + "/" + mes + "/" + dia);
								
//ciere dia-febrero-------------------------------------------------------------------------------------------	
							}else {
								System.out.println("Datos erroneos");
							}
							
//cierre febrero----------------------------------------------------------------------------------------------
						}else {

//meses 31----------------------------------------------------------------------------------------------------
							if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
								
//dias 31-----------------------------------------------------------------------------------------------------
								if(dia >=1 && dia <= 31) {
									
//respuesta---------------------------------------------------------------------------------------------------
									System.out.println(año + "/" + mes + "/" + dia);
									
//cierre dia 31-----------------------------------------------------------------------------------------------									
								}else {
									System.out.println("Datos erroneos");
								}
								
//cierre meses 31---------------------------------------------------------------------------------------------
							}else {				

//dias 30-----------------------------------------------------------------------------------------------------
								if(dia >=1 && dia <= 30) {
									
//respuesta---------------------------------------------------------------------------------------------------
									System.out.println(año + "/" + mes + "/" + dia);
									
//cierre dia 30-----------------------------------------------------------------------------------------------									
								}else {
									System.out.println("Datos erroneos");
								}
							}//corchete de cierre mes 31
								
						}//corchete de cierre febrero

//cierre meses------------------------------------------------------------------------------------------------						
					}else {
						System.out.println("Datos erroneos");
					}

//cierre años bisisestos--------------------------------------------------------------------------------------
				}else {
					
//meses-------------------------------------------------------------------------------------------------------
					if(mes >=1 && mes <= 12) {
						
//febrero-----------------------------------------------------------------------------------------------------
						if(mes == 2) {
							
//Dias febrero------------------------------------------------------------------------------------------------
							if(dia >=1 && dia <= 28) {
								
//respuesta---------------------------------------------------------------------------------------------------
								System.out.println(año + "/" + mes + "/" + dia);
								
//ciere dia-febrero-------------------------------------------------------------------------------------------	
							}else {
								System.out.println("Datos erroneos");
							}
							
//cierre febrero----------------------------------------------------------------------------------------------
						}else {

//meses 31----------------------------------------------------------------------------------------------------
							if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
								
//dias 31-----------------------------------------------------------------------------------------------------
								if(dia >=1 && dia <= 31) {
									
//respuesta---------------------------------------------------------------------------------------------------
									System.out.println(año + "/" + mes + "/" + dia);
									
//cierre dia 31-----------------------------------------------------------------------------------------------									
								}else {
									System.out.println("Datos erroneos");
								}
								
//cierre meses 31---------------------------------------------------------------------------------------------
							}else {				

//dias 30-----------------------------------------------------------------------------------------------------
								if(dia >=1 && dia <= 30) {
									
//respuesta---------------------------------------------------------------------------------------------------
									System.out.println(año + "/" + mes + "/" + dia);
									
//cierre dia 30-----------------------------------------------------------------------------------------------									
								}else {
									System.out.println("Datos erroneos");
								}
							}//corchete de cierre mes 31
							
						}//corchete de cierre febrero

//cierre meses------------------------------------------------------------------------------------------------						
					}else {
						System.out.println("Datos erroneos");
					}
				}//cierre años bisiestos

//cierre años-------------------------------------------------------------------------------------------------
			}else {
				System.out.println("Datos erroneos");
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
		
		entrada.close();
	}
}