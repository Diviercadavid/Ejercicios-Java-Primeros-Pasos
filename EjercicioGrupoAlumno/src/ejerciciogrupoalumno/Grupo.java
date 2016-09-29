/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogrupoalumno;

import java.util.Scanner;

/**
 *
 * @author Dcadavid
 */
public class Grupo {
    
    private Alumno[] alumnos = null;
    Alumno a = new Alumno();

    public Grupo() {
        alumnos = new Alumno[5];
        
        for (int i = 0; i < 5; i++) {
            alumnos[i] = new Alumno();
            Llenaralumno();
        }

    } public  
     
            
       
      void Llenaralumno(){
    
        Scanner Dato = new Scanner(System.in);
      
        
            
       System.out.print("Ingrese el nombre del alumno: ");
        a.setNombre(Dato.next());
        
        System.out.print("Ingrese el  Apellido: ");
        a.setApellidos(Dato.next());
        
        System.out.print("Ingrese el DNI: ");
        a.setDNI(Dato.next());
        
        System.out.print("Ingrese el Telefono del alumno: ");
        a.setTelefono(Dato.next());
        
        
        
        
        
        
        
    }

        


    
public void Imprimiralumnos(){
            Alumno a = new Alumno();
            
            for (int i = 0; i < 5; i++) {
                System.out.println("Alumno " + i+1 +" : " );
                
            }
        
        
        
        }
}
