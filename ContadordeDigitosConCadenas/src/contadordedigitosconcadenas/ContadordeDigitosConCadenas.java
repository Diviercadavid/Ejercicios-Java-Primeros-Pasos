

package contadordedigitosconcadenas;


public class ContadordeDigitosConCadenas {

    public int length;

    public static void main(String[] args) {
        int num = 1532187346;
        String cadena = "";
        
        cadena=Integer.toString(num);
         cadena = new String (cadena);
         
         System.out.println("El numero " + num + " tiene "+ cadena.length() + " caracteres" );
         
             
        
    }
    
}
