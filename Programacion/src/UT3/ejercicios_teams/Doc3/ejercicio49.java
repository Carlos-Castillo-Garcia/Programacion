package UT3.ejercicios_teams.Doc3;

import java.util.Scanner;


public class ejercicio49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		long numero;           
		long cifranueva=0;
		System.out.println("ingrese el numero");
		numero= entrada.nextLong(); 
		long aux= numero; 
		do {
			numero = aux;
			cifranueva = 0;
			do{  
				cifranueva=cifranueva + (numero % 10);
				numero = numero/10;   	   
				System.out.println(numero+" La suma de los digitos de "+aux+" es "+cifranueva); 

			}while (numero != 0);
			aux = cifranueva;
		}while(cifranueva > 9);
	}
}
