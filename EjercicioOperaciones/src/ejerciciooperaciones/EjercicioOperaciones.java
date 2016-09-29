

package ejerciciooperaciones;
import java.util.Scanner;
public class EjercicioOperaciones {


    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        
        double num3 = 0;
        double num4 = 0;
        
        Scanner d = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: " );
        num1 = d.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = d.nextInt();
        System.out.print("Ingrese el primer numero decimal:");
        num3 = d.nextDouble();
        System.out.print("Ingrese el primer numero decimal:");
        num3 = d.nextDouble();
        
        System.out.println("___________________________________");
        
        
        System.out.println("Suma de los 2 enteros: " + (num1 + num2));
        
        System.out.println("Suma de los Reales: " + (num3+num4));
        
        System.out.println("___________________________________");
        System.out.println("Resta de los 2 enteros: " + (num1 - num2));
        System.out.println("Resta de los Reales: " + (num3-num4));
        System.out.println("___________________________________");
        System.out.println("Divicion de los 2 enteros: " + (num1 / num2));
        System.out.println("Divicion de los Reales: " + (num3/num4));
        System.out.println("___________________________________");
        System.out.println("Multiplicacion de los 2 enteros: " + (num1 * num2));
        System.out.println("Multiplicacion de los Reales: " + (num3*num4));
        System.out.println("___________________________________");
        System.out.println("Residuo de los 2 enteros: " + (num1 % num2));
        System.out.println("Residuo de los Reales: " + (num3%num4));
        
        
        
        
                
        
    }
    
}
