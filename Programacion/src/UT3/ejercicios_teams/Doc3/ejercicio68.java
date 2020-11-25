/**
 * 
 */
package UT3.ejercicios_teams.Doc3; 
import java.util.Scanner; 
/** 

* @author CARLOS 
* 
*/ 
public class ejercicio68 { 
    /** 
     * @param args 
     */ 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
    	Scanner entrada = new Scanner(System.in); 
    	
        int alumnos;         

        System.out.print("INGRESAR NÚMERO DE ALUMNOS: "); 
        alumnos=entrada.nextInt(); 
        System.out.println(); 


        double asignatura1[] = new double[alumnos]; 
        double asignatura2[] = new double[alumnos]; 
        double asignatura3[] = new double[alumnos]; 

        int contalum=0, contasig1=0, contasig2=0, contasig3=0; 

        for(int i=0; i < alumnos; i++) { 
   
            System.out.print("ALUMNO " +(i+1)+ " ASIGNATURA 1: "); 
            asignatura1[i] = entrada.nextDouble();
            
            System.out.print("ALUMNO " +(i+1)+ " ASIGNATURA 2: "); 
            asignatura2[i] = entrada.nextDouble();          
            
            System.out.print("ALUMNO " +(i+1)+ " ASIGNATURA 3: ");
            asignatura3[i] = entrada.nextDouble(); 
            
            System.out.println(""); 
        } 

        System.out.println(""); 

        for(int i=0; i<alumnos; i++) { 
            contalum=0; 

            System.out.println("ALUMNO " +(i+1)+ " ASIGNATURA 1: " +asignatura1[i]); 
            System.out.println("ALUMNO " +(i+1)+ " ASIGNATURA 2: " +asignatura2[i]);
            System.out.println("ALUMNO " +(i+1)+ " ASIGNATURA 3: " +asignatura3[i]); 
            System.out.println("ALUMNO " +(i+1)+ " MEDIA: " +(asignatura1[i]+asignatura2[i]+asignatura3[i])/3); 

            if(asignatura1[i]<5) { 
                contalum++; 
                contasig1++; 
            } 

            if(asignatura2[i]<5) { 
                contalum++; 
                contasig2++; 
            } 

            if(asignatura3[i]<5) { 
                contalum++; 
                contasig3++; 
            } 

            System.out.println("ALUMNO " +(i+1)+ " SUSPENSOS: " +contalum); 
            System.out.println(); 

        } 

        System.out.println("ASIGNATURA 1 SUSPENSOS "  +contasig1); 
        System.out.println("ASIGNATURA 2 SUSPENSOS "  +contasig2); 
        System.out.println("ASIGNATURA 3 SUSPENSOS "  +contasig3); 
        
    entrada.close();
    }   

} 