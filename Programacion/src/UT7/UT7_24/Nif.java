/**
 * 
 */
package UT7.UT7_24;
/**
 * @author Manuel
 *
 */
public class Nif {

	private int dni;
	private char letra;

	public Nif() {
		dni = 0;
		letra = ' ';
	}
	public Nif(int dni) {
		this.dni = dni;
		this.letra = cal_letra(dni);
	}

	public int getdni() {
		return dni;
	}
	public char getletra() {
		return letra;
	}
	public void setdni(int dni) {
		this.dni = dni;
		this.letra = cal_letra(dni);
	}
	@Override
	public String toString() {
		return "Esta es la letra de tu dni: "+String.format("%08d", dni)+"-"+letra;
	}
	
	public void leer(int dni) {
		this.letra = cal_letra(dni);
		this.dni = dni;
	}
	private char cal_letra(int dni) {
		
		char[] letras = {'T','R','W','A','G','M',
				'Y','F','P','D','X','B','N','J',
				'Z','S','Q','V','H','L','C','K','E'};
        return letras[dni % 23];
	}
}
