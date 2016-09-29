


package ejerciciofactorial;

import java.util.*;

public class EjercicioFactorial {

    
    
    
    public static void main(String[] args) {

        
        double respuesta = 1;
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        respuesta = dato.nextDouble();

        
        

        while(respuesta <= 0) {

             System.out.println("El numeor no es valido");
             System.out.print("Ingrese un numero: ");
        respuesta = dato.nextInt();

        }{ int c = (int) respuesta; 
        
            for (int i = 1; i < c; i++) {

                respuesta = respuesta * i;

            }
            {
                System.out.println("Respuesta " + respuesta);
            }
           
        }
        {

        }

    }

}
