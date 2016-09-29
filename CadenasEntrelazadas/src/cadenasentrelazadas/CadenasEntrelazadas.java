package cadenasentrelazadas;

public class CadenasEntrelazadas {

    public int length;
    public char charAt;

    public static void main(String[] args) {

        String texto1 = "1;2;3";
        String[] vectorNum = texto1.split(";");
        String texto2 = "a;b;c";
        String[] vectorLetr = texto2.split(";");
        String textoR = "";

        for (int i = 0; i < vectorNum.length; i++) {
           textoR = textoR + vectorNum[i]+""+vectorLetr[i];
        }

        System.out.println("y eso fue todo :DResultado: "+textoR );
        
        int indice = 0;
        int c = 0;
        while (c < 3) {

            
        }

    }
}
