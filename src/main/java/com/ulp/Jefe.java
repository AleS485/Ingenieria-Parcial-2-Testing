
package com.ulp;


public class Jefe extends Personaje{
    
    private int cantidadEvoluciones;
    private int potenciaSuperPoder;
    private boolean vuela;
    
    public Jefe() {
        super();
    }
    
    public Jefe(int x, int y, int nivelEnergia, int numeroVidas, int capacidadOfensiva, int ancho, int alto, String textura, int cantidadEvoluciones, int potenciaSuperPoder, boolean vuela) {
        super(x, y, nivelEnergia, numeroVidas, capacidadOfensiva, ancho, alto, textura);
        this.cantidadEvoluciones = cantidadEvoluciones;
        this.potenciaSuperPoder = potenciaSuperPoder;
        this.vuela = vuela;
    }
    
    public void evolucionar() {
        this.cantidadEvoluciones++;
        this.capacidadOfensiva += 15; 
        System.out.println("EL JEFE EVOLUCIONO A LA FASE: " + this.cantidadEvoluciones);
    }
    
    public void lanzarSuperPoder() {
        System.out.println("JEFE LANZA UN ATAQUE CON POTENCIA DE: " + this.potenciaSuperPoder);
    }
    
    
    public void volar() {
        if (this.vuela) {
            System.out.println("EL JEFE EMPIEZA A VOLAR");
        } else {
            System.out.println("EL JEFE NO PUEDE VOLAR");
        }
    }
    
    public ObjetoMovil soltarPieza() {
        System.out.println("EL JEFE FUE DERROTADO Y SOLTO UNA PIEZA DE ARMADURA");
        
        Casco piezaSoltada = new Casco(this.getX(), this.getY(), 25);
        return piezaSoltada; 
    }
    
    public int getCantidadEvoluciones() {
        return cantidadEvoluciones;
    }

    public void setCantidadEvoluciones(int cantidadEvoluciones) {
        this.cantidadEvoluciones = cantidadEvoluciones;
    }

    public int getPotenciaSuperPoder() {
        return potenciaSuperPoder;
    }

    public void setPotenciaSuperPoder(int potenciaSuperPoder) {
        this.potenciaSuperPoder = potenciaSuperPoder;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
}
