package hellokitty;
public class HelloKitty {
    public static void main(String[] args) {
        String palabra = "Kitty";
        int n = 2;
        String Resultado1 = "";
        String Resultado = "";
        int tamaño;

        for (int c = 0; c < n; c++) {

            Resultado1 = Resultado1 + palabra;

        }
        {
            tamaño = Resultado1.length();
            System.out.println("Resultado = " + Resultado1);
        }

        for (int i = 0; i <= n + 1; i++) {

            Resultado = palabra.substring(i + 1, palabra.length()) + Resultado1.substring(0, Resultado1.length());
            
            System.out.println("Resultado = " + Resultado.substring(0, tamaño));
        }
    }
}
