package UT3.practicas;

import java.util.Scanner;


public class ejercicio_papa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato_longroducido=new Scanner(System.in);
		long numero;           
		long cifranueva=0;
		System.out.println("ingrese el numero");
		numero= dato_longroducido.nextLong(); 
		long aux= numero; 

		            do{
		        	   cifranueva = 0;
		        	   numero = aux;
			           do{ 
			        	   cifranueva=cifranueva + (numero % 10);
			        	   numero = numero/10;   	   
			        	   System.out.println(numero+" La suma de los digitos de "+aux+" es "+cifranueva); 
			        	   
			           }while (numero != 0);
			           aux = cifranueva;
		           }while(aux > 9);
		           

			System.out.println("La suma de los digitos de "+aux+" es "+cifranueva);


	}
}