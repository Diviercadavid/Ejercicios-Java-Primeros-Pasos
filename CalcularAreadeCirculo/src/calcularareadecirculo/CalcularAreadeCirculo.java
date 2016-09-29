
package calcularareadecirculo;

import java.util.Scanner;

public class CalcularAreadeCirculo {
    
    

    public static double CalcuArea(double radio) {
        
        double pi = 3.14;
        double area = 0;
        double valor2 = radio;

        for (int c = 0; c < (2 - 1); c++) {

            radio = radio * valor2;

        }
        area = pi * radio;

        return area;
    }

    public static void main(String[] args) {

        double radio = 0;
        double area = 0;
        String decision = "s";

        Scanner d = new Scanner(System.in);

        while (decision.equals("s")) {
            System.out.print("Ingresar el radio del circulo : ");
            radio = d.nextDouble();
            area = CalcuArea(radio);

            System.out.println("El area del radio es de: " + area);
            System.out.print("::::...Calcular otro Circulo? s|n: ");
            decision = d.next();
        }

    }

}
