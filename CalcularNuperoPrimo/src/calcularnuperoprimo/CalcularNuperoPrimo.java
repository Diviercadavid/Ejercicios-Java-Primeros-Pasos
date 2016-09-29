
package calcularnuperoprimo;


public class CalcularNuperoPrimo {

   
    public static void main(String[] args) {
        int  numero = 5;
        
        if ( numero <= 0 ){
            System.out.println("Ingrese un Valor valido"); 
        }
        else { 
            if ( (numero % 2) == 0 ){
                System.out.println("El numero es par");
                
            }
            else{
                System.out.println("El numero es impar");
            }
                
            
        }
       
        
    }
    
}
