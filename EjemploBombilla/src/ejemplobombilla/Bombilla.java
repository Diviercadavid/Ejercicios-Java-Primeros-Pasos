/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobombilla;

/**
 *
 * @author Dcadavid
 */
public class Bombilla {
    
    private boolean estado = false;
    public Bombilla(){
    estado = false;
    }
    public Bombilla(boolean estado){
    this.estado = estado;
    }
    
    
    public void encender() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

    public void consultarEstado() {
        if (estado == true) {
            System.out.println("Bombilla Encendida *");
        } else {
            System.out.println("Bombilla Apagada  . ");
        }

    }

}
