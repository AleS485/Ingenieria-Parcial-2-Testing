
package com.ulp;


public class Enemigo extends Personaje{
  
    private boolean tieneHabilidad;
    
    public Enemigo(){
        super();
    }
    
    public Enemigo(int x, int y, int nivelEnergia, int numeroVidas, int capacidadOfensiva, int ancho, int alto, String textura, boolean tieneHabilidad) {
        super(x, y, nivelEnergia, numeroVidas, capacidadOfensiva, ancho, alto, textura);
        this.tieneHabilidad = tieneHabilidad;
    }
    
    
    
    
    
    
    
    
}
