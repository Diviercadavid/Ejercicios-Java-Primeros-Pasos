/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistas2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dcadavid
 */
public class EjemploListas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        List<Integer> Numero;
        Numero=new ArrayList<>();
        
        Numero.add(1);
        Numero.add(15);
        Numero.add(21);
        
        Numero.remove(1);
        System.out.println(Numero.get(1));
        System.out.println(Numero.get(0));
        */
        
        List <String> Nombre;
        Nombre = new ArrayList<>();
        
        Nombre.add("Colombia");        
        Nombre.add("Chile");
        Nombre.add("Peru");
        
        System.out.println(Nombre.size());//Tamaño de la lista
        System.out.println(Nombre.contains("Chile"));//Busca en las listas un objeto, Devuelve TRUE o FALSE
    }
    
}
