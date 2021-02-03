/**
 * 
 */
package UT7.UT7_24;

import java.util.Scanner;

/**
 * @author Manuel
 *
 */
public class dni_calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scint = new Scanner(System.in);
		
		Nif Dni = new Nif();
		System.out.println(Dni);
		
		Dni.setdni(5296544);
		System.out.println(Dni);
		
		
		
		scint.close();
	}

}
