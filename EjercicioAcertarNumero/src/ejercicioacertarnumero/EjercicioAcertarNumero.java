/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioacertarnumero;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioAcertarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();
        Scanner dato = new Scanner(System.in);

        int numero = 0;
        int num_random = r.nextInt(100);
        //Guarda el numero randon de 0 a 99
        String SN = "s";
        int intentos = 0;

        do {
            System.out.print(" Ingrese un numero: ");
            numero = dato.nextInt();
            //ingresa un numero 
            
            if (numero == num_random) {
                // Si el numero ingresado es igual al num random
                System.out.println("Diste con el numero ");
                
            } else if (numero < num_random) {
                //Si el numero es Menor que el numero random
                System.out.print(numero + " Es Menor que el numero oculto");
                //Pregunta si quiere volver a intentarlo
                System.out.print("  Desea ingresar otro numero? s|n: ");
                SN = dato.next();

            } else if (numero > num_random) {
                //Si el numero es Manor que el numero random
                System.out.println(numero + " Es Mayor que el numero oculto");
                //Pregunta si quiere volver a intentarlo
                System.out.print("  Desea ingresar otro numero? s|n: ");
                SN = dato.next();
            }

        } while (SN.equals("s") && (numero != num_random));
        // Si SN = s y Numero es diferente de random.. repetira el proceso 
    }
}
        

       

        
    
    

