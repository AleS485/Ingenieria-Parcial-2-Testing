
package com.ulp;

import java.util.ArrayList;
import java.util.List;


public class Mochila {
   
    private int capacidadMaxima;
    

    private ArrayList<ObjetoMovil> items;


    public Mochila() {
        this.capacidadMaxima = 3; 
        this.items = new ArrayList<ObjetoMovil>();
    }


    public Mochila(int capacidadMaxima) { // por si hago una mochila mas grande
        this.capacidadMaxima = capacidadMaxima;
        this.items = new ArrayList<ObjetoMovil>();
    }

    public void ampliarCapacidad(int capacidadModificada) {
        this.capacidadMaxima = capacidadModificada;
    }
    
   
    public void agregarObjeto(ObjetoMovil obj) {
        if (this.items.size() < this.capacidadMaxima) {
            this.items.add(obj);
            System.out.println("Se agrego bien el objeto");
        } else {
            System.out.println("No hay espacio suficiente en la mochila");
            throw new ArrayIndexOutOfBoundsException("LA MOCHILA SUPERO LA CAPACIDAD MAXIMA");
        }
    }

    
    public List<ObjetoMovil> mostrarObjetos() {
        System.out.println("Estos objetos estan en la mochila: ");
        if (this.items.isEmpty()) {
            System.out.println("NO HAY NADA EN LA MOCHILA.");
        } else {
            for (int i = 0; i < this.items.size(); i++) {
                ObjetoMovil item = this.items.get(i);
                System.out.println("[" + (i + 1) + "] " + item.getClass().getSimpleName());
            }
        }
        return this.items;
    }
    
    public void tirarObjeto(ObjetoMovil obj) {
        if (this.items.remove(obj)) {
            System.out.println("SE TIRO EL OBJETO DE TU MOCHILA");
        } else {
            System.out.println("ESE OBJETO NO ESTABA EN LA MOCHILA");
        }
    }
    
    public void usarObjeto(ObjetoMovil obj) {
        if (this.items.contains(obj)) {
            System.out.println("ESTAS USANDO EL OBJETO: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("NO PODES USAR ESTE OBJETO PORQUE NO ESTA EN TU MOCHILA");
        }
    }
    
    
    
    public ArrayList<ObjetoMovil> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<ObjetoMovil> items) {
        this.items = items;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    
    
    
    
    
    
    
    
    
    
}
