package dowhilesumadenumero;

import java.util.Scanner;

public class DoWhileSumaDeNumero {

    public static void main(String[] args) {

        int numero1 = 0;

        int Resultado = 0;
        String SN;
        Scanner dato = new Scanner(System.in);

        System.out.print("Desea Sumar numeros?(s/n) ");
        SN = dato.next();

        while (SN.equals("s")) {

            System.out.print("Ingrese un numero: ");
            numero1 = dato.nextInt();

            Resultado = numero1 + Resultado;

            System.out.print("Desea Sumarlo con otro? (s/n) ");
            SN = dato.next();

        }
        System.out.println("El total de las sumas es: " + Resultado);

    }

}
    


