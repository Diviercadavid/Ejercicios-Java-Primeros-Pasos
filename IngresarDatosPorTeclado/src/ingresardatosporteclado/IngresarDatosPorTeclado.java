

package ingresardatosporteclado;

import java.util.Scanner;

public class IngresarDatosPorTeclado {

   
    
    public static void main(String[] args) {
        
        String texto="";
        int numero1=0;
    Scanner d = new Scanner(System.in);
        System.out.print("Ingrese su nombre: " + texto);
        
        
        
        texto = d.next();
        
        numero1 = Integer.parseInt(texto);
        System.out.println("Bienvenido " + numero1);    
    }
    
}
