package traductorcodmorse;

public class TraductorCodMorse {

    public static void main(String[] args) {

        String texto = "DIVIER CADAVID GAITAN";
        String [] vect_texto;
        vect_texto = texto.split(" ");
        String vocales="";
        char letra = ' ';
        String TextoR = "";
        for (int i = 0; i < (texto.length() ); i++) {

            letra = texto.charAt(i);

            switch (letra) {
                case 'A': {
                    TextoR = TextoR + ".-";
                    vocales = vocales + "A";
                    break;
                }
                case 'B': {
                    TextoR = TextoR + "-...";
                    break;
                }
                case 'C': {
                    TextoR = TextoR + "-.-.";
                    break;
                }
                case 'D': {
                    TextoR = TextoR + "-..";
                    break;
                }
                case 'E': {
                    TextoR = TextoR + ".";
                    vocales = vocales + "E";
                    break;
                                    }
                case 'F': {
                    TextoR = TextoR + "..-.";
                    break;
                }
                case 'G': {
                    TextoR = TextoR + "--.";
                    break;
                }
                case 'H': {
                    TextoR = TextoR + "....";
                    break;

                }
                case 'I': {
                    TextoR = TextoR + "..";
                    vocales = vocales + "I";
                    break;

                }
                case 'J': {
                    TextoR = TextoR + ".---";
                    break;

                }
                case 'K': {
                    TextoR = TextoR + "-.-";
                    break;

                }
                case 'L': {
                    TextoR = TextoR + ".-..";
                    break;

                }
                case 'M': {
                    TextoR = TextoR + "--";
                    break;
                }
                case 'N': {
                    TextoR = TextoR + "-.";
                    break;
                }
                case 'Ñ': {
                    TextoR = TextoR + "--.--";
                    break;
                }
                case 'O': {
                    TextoR = TextoR + "---";
                    vocales = vocales + "O";
                    break;
                }
                case 'P': {
                    TextoR = TextoR + ".--.";
                    break;
                }
                case 'Q': {
                    TextoR = TextoR + "--.-";
                    break;
                }
                case 'R': {
                    TextoR = TextoR + ".-.";
                    break;
                }
                case 'S': {
                    TextoR = TextoR + "...";
                    break;
                }
                case 'T': {
                    TextoR = TextoR + "-";
                    break;
                }
                case 'U': {
                    TextoR = TextoR + "..-";
                    vocales = vocales + "U";
                    break;
                }
                case 'V': {
                    TextoR = TextoR + "...-";
                    break;
                }
                case 'W': {
                    TextoR = TextoR + ".--";
                    break;
                }
                case 'X': {
                    TextoR = TextoR + "-..-";
                    break;
                }
                case 'Y': {
                    TextoR = TextoR + "-.--";
                    break;
                }
                case 'Z': {
                    TextoR = TextoR + "--..";
                    break;
                }
                case ' ': {
                    TextoR = TextoR + ' ';
                    break;
                }

            }

        }
        System.out.println("xxxxxxx  .-.Código morse.-.  xxxxxxx");
        System.out.println("Traducindo " + texto + " : " + TextoR);
        System.out.println("El texto tiene " + vocales.length()+" Vocales" );
        System.out.println("El texto tiene " + vect_texto.length + " palabras" );
    }
}

        
    
    
