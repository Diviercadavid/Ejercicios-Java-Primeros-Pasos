/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocoche;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dcadavid
 */
public class Coche {
    
    private List<Rueda> ruedas = null;
    private List<Motor> motores = null;
    private List<Puerta> puerta = null;
    
    public Coche(){
    
    ruedas = new ArrayList();
        for (int i = 0; i < 4; i++) {
            
            ruedas.add(new Rueda());
        }
        
        
        motores = new LinkedList();{
        puerta = new ArrayList();
        
        motores.add(new Motor());
        for (int i = 0; i < 5; i++) {
            
            puerta.add(new Puerta());
            
        }
        }
    }
    
    
    
    
    
    
    
    
    
    
     private String marca;
    private String modelo;
    private int color;

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int color) {
        this.color = color;
    }
}
