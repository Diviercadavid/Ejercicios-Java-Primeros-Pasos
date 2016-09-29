

package ejemplodowhile;

import java.util.Scanner;


public class EjemploDoWhile {


    
    public static void main(String[] args) {

        String SN = "";
        int vuelta = 0;

        Scanner dato = new Scanner(System.in);
        System.out.println("Quieres que ses repita? S/N");
        SN = dato.next();

        do {
            vuelta++;
            System.out.println(vuelta + " Vuelta.");
            System.out.println("Quieres que ses repita? S/N");
            SN = dato.next();
        } while (SN.equals("S"));

    }

}
