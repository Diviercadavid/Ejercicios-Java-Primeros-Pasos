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
public class Nodo {
    Object valor;
    Nodo siguiente = null;
    
    public Nodo(Object valor) {

        this.valor = valor;
        siguiente = null;
    }

    public Object objectValor() {
        return valor;

    }

    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;

    }

}
