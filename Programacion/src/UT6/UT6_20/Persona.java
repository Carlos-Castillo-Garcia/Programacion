/**
 * 
 */
package UT6.UT6_20;

/**
 * @author CARLOS
 *
 */
public class Persona {
	//Creacion de las variables privadas
	private String nombre;
	private String apellidos;
	private int anionacimiento;
	private int mesnacimiento;
	private int dianacimiento;
	private char sexo;
	
	public Persona() {
		
	}
	
	//Creacion de la clase 
	public Persona(String n, String a, int anio, int mes, int dia, char sexo) {
		
		setnombre(n);
		setapellidos(a);
		setanio(anio);
		setmes(mes);
		setdia(dia);
		setsexo(sexo);
	}
	
	//creado de getters publicos
	public String getnombre() {
		return this.nombre;
	}
	public String getapellidos() {
		return this.apellidos;
	}
	public int getanio() {
		return this.anionacimiento;
	}
	public int getmes() {
		return this.mesnacimiento;
	}
	public int getdia() {
		return this.dianacimiento;
	}
	public char getsexo() {
		return this.sexo;
	}
	public int getedad() {
		int edad = java.time.LocalDate.now().getYear() - this.anionacimiento;
		return edad;
	}

	
	//creado de setters publicos
	public void setnombre(String n) {
		//conversion de nombres compuestos
		n = convertirNYA(n);
		
		//si es menos de 4 letras, uso sin especificar
		if(n.length() < 4) {
			nombre = "sin especificar";
		}

		this.nombre = n;
		
	}
	public void setapellidos(String a) {
		//formateado de apellidos
		a = convertirNYA(a);
		
		//si es menos de 4 letras, uso sin especificar
		if(a.length() < 4) {
			a = "sin especificar";
		}
		this.apellidos = a;
	}
	public void setanio(int anio) {
		if (anio < 1900 || anio >2020) {
			anio = 2000;
		}
		
		this.anionacimiento = anio;
	}
	public void setmes(int mes) {
		if(mes < 1 || mes > 12) {
			mes = 1;
		}
		
		this.mesnacimiento = mes;
	}
	public void setdia(int dia) {
		if(dia <= 1 || dia >= 31) {
			dia = 1;
		}
		
		this.dianacimiento = dia;
	}
	public void setsexo(char sexo) {
		if(sexo != 'H') {
			if(sexo != 'M') {
				sexo = 'X';
			}
		}
		this.sexo = sexo;
	}
	
	//creado de funciones para mostrar y calcular datos
	public String mostrarEdad() {
		return "En la actualidad tengo " + getedad() + " años." ;
	}
	public String saludar() {
		return "Hola soy " + getnombre() + getapellidos() +" y naci el " + getdia()+ "/" + getmes()+ "/" + getanio()+ ".";
	}
	
	private String mayusculas(String p) {
		String npropio = p.toLowerCase();
		String letra = p.substring(0, 1).toUpperCase();
		npropio = letra+npropio.substring(1);
		return npropio;
	}
	private String convertirNYA(String n) { /*NYA = nombres y apellidos*/
		//Conversion  de nombres propios en un array de strings separado por espacios
		String[] array_propios = n.split(" ");
		
		//conversion de la primera letra de cada palabra en mayuscula
		for (int i = 0; i < array_propios.length; i++) {
			array_propios[i] = mayusculas(array_propios[i]);
		}
		
		//Concatenacion de los apellidos formateados
		String nombres_formateado = "";
		for (int i = 0; i < array_propios.length; i++) {
			nombres_formateado = nombres_formateado + array_propios[i] + " ";
		}
		return nombres_formateado;
	}
	
}











