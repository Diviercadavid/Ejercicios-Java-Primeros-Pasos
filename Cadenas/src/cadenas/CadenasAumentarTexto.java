


package cadenas;


public class CadenasAumentarTexto {

    
    public static void main(String[] args) {
    
        String nombre = "D-i-v-i-e-r-A-l-i-r-i-o";
        
        String [] vector_nom = nombre.split("-");
        
        
        for (int i=0; i < nombre.length(); i++){
            
        //System.out.println("vectornom: " + vector_nom[i]);
        System.out.println("vectornom: " + nombre.substring(0, i+1));
        
        }
        
        
        
        
    }
    
}
