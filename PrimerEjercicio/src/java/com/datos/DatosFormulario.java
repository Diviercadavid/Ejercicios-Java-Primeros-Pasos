/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datos;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Usuario
 */
@Named(value = "datosFormulario")
@RequestScoped
public class DatosFormulario {
private String nombre;
private int edad;
        
    
    public DatosFormulario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
