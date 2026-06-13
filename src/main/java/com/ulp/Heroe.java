
package com.ulp;


public class Heroe extends Personaje{
    
    private String nombreHeroe;
    private Armadura armaduraEquipada;
    private Mochila miMochila;
    
    public Heroe() {
        super();
        this.miMochila = new Mochila(3); 
    }

    public Heroe(int x, int y, int nivelEnergia, int numeroVidas, int capacidadOfensiva, int ancho, int alto, String textura, String nombreHeroe, Mochila mochila) {
        super(x, y, nivelEnergia, numeroVidas, capacidadOfensiva, ancho, alto, textura);
        this.nombreHeroe = nombreHeroe;
        this.miMochila = mochila; 
    }
    
    public void equiparArmadura(Armadura nuevaArmadura) {
        this.armaduraEquipada = nuevaArmadura;
        System.out.println(this.nombreHeroe + ", te equipaste una armadura");
    }

    public void asignarMochila(Mochila mochila) {
        this.miMochila = mochila;
    }
    
    
    public void combatir(Personaje npc) {
        this.atacar(); 
        
        npc.setVida(npc.getVida() - this.capacidadOfensiva);
        
        System.out.println("Despues de combatir la vida del oponente es de: " + npc.getVida());
    }
    
    public void recogerObjeto(ObjetoMovil obj){
        
        if (this.miMochila != null) {
            this.miMochila.agregarObjeto(obj);
            System.out.println(this.nombreHeroe + " ha recolectado algo del piso");
        } else {
            System.out.println("No tenes una mochila asignada para guardar los objetos");
        }
        
        
    }
    
    
    
    
    
    
    
    
    
}


