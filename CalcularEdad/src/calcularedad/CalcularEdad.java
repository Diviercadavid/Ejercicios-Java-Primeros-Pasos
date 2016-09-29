
package calcularedad;

import jdk.nashorn.internal.parser.TokenType;

public class CalcularEdad {

    public static void main(String[] args) {
       int edad = 60;
       String estado;
       
       if (edad < 12){
       estado = "Es un niño";
       
       System.out.println(estado);
       } else {
              
       if ((edad >= 13) && (edad <= 17)) { 
           
               estado = "Es un adolescente";
               System.out.println(estado);    
       } else {
       if (edad >=18){
           estado = "Es mayor de edad";
           System.out.println(estado);
       }
       }
       }
    }}
//}

               
       
       
              
        
    
    
        

    

