/**
 * 
 */
package UT3.Semanales;

import java.util.Scanner;

/**
 * @author CARLOS
 *
 */
public class semanal6 {

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		Scanner entrada=new Scanner(System.in);
		int salir = 1;
		do {
			String frase1 = " ";
			String frase2 = " ";
			int salida = 0;
			char[] charf1;
			char[] charf2;
			int contador1[];
			int contador2[];
			int contador3=0;
			int contador4=0;
			int contador5=0;
			int contador6=0;

			frase1 = pedida(frase1, salida, entrada);
			frase2 = pedida(frase2, salida, entrada);
			charf1=frase1.toCharArray();
			contador5 = espacios(charf1, contador5);
			charf2=frase2.toCharArray();
			contador6 = espacios(charf2, contador6);
			if(contador5==contador6) {
				contador1= new int [charf1.length];
				rellenadoint(contador1, charf1);
				contador2= new int [charf2.length];
				rellenadoint(contador2, charf2);
				borradoarray(charf1, contador1);
				borradoarray(charf2, contador2);

				for(int i=0; i<charf2.length; i++) {
					for(int j=0; j<charf2.length; j++) {
						if(contador1[i]!=0) {
							if(charf1[i]==charf2[j]&&contador1[i]==contador2[j]) {
								contador3++;
							}
						}
					}
				}

				for(int i=0; i<charf1.length; i++) {
					if(contador1[i]!=0) {
						contador4++;
					}
				}

				if(contador3==contador4) {
					System.out.println("Si es un anagrama");
				}else {
					System.out.println("no es un anagrama");
				}
			}else {
				System.out.println("no es un anagrama");
			}

			salir = salida(entrada, salir);
		}while(salir != 1);


	}
	private static int salida(Scanner a, int b) {
		System.out.println("¿Desea salir del programa? ( 0 = No ; 1 = Si )");  
		b = a.nextInt();                                            
		if(b == 1) {                                                    
			System.out.println("Hasta luego");                               
		}else {                                                                
			System.out.println("");               							  
		}
		return b;
	}
	private static String pedida(String a, int b, Scanner entrada) {
		
		do {
			System.out.println("Escribe una frase:");
			a=entrada.nextLine().replace(" ","");
			
			if(a.length()>1000){
				System.out.println("Esta frase es muy grande escribe otra");
			}else {
				b=1;
			}

		}while(b!=1);
		
		return a;
	}
	private static int espacios(char[] u, int j) {
		for(int i=0; i<u.length; i++) {
			j++;
		}
		return j;
	}
	private static void rellenadoint(int[] cont, char[] letras) {
		for(int i=0; i<letras.length;i++){
			for(int j=0; j<letras.length; j++) {
				if(letras[j]==letras[i]) {
					cont[i]++;
				}
			}
		}
	}
	private static void borradoarray(char[] l, int[] c) {
		for(int i=0; i<l.length; i++) {
			for(int j=0; j<l.length; j++) {
				if(i!=j) {
					if(l[i]==l[j]) {
						for(int y=j; y<l.length; y++) {
							if(y!=(l.length-1)) {
								l[y]=l[y+1];
								c[y]=c[y+1];
							}else {
								l[y]=0;
								c[y]=0;
							}
						}
					}
				}
			}
		}
	}
}