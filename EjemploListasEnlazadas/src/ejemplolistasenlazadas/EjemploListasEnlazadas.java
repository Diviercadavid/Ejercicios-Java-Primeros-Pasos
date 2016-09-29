/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistasenlazadas;

/**
 *
 * @author Dcadavid
 */
public class EjemploListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercer = new Nodo("Hola");
        
        primer.enlazarSiguiente(segundo);
        primer.obtenerSiguiente().enlazarSiguiente(tercer);
        System.out.println(primer.obtenerSiguiente().
                objectValor());
    }
    
}
