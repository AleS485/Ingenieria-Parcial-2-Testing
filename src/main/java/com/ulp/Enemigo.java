
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

    public boolean isTieneHabilidad() {
        return tieneHabilidad;
    }

    public void setTieneHabilidad(boolean tieneHabilidad) {
        this.tieneHabilidad = tieneHabilidad;
    }
    
    public ObjetoMovil soltarPieza() {
        System.out.println("enemigo derrotado, solto un objeto");
        
        Casco piezaDropeada = new Casco(this.getX(), this.getY(), 15); 
        return piezaDropeada;
    }
    
    @Override
    public void aprenderHabilidad(Habilidad h) {
        if (this.tieneHabilidad) {
            super.aprenderHabilidad(h); 
        } else {
            System.out.println("ESTE ENEMIGO NO ES CAPAZ DE APRENDER HABILIDADES");
        }
    }
    
    
    
    
}
