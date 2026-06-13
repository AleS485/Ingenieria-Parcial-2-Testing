
package com.ulp;

import java.util.ArrayList;


public abstract class Personaje extends EntidadJuego{
    

    protected int nivelEnergia;
    protected int numeroVidas;
    protected int capacidadOfensiva;
    protected int ancho;
    protected int alto;
    protected String textura;
    protected int vida;
    protected int energia;
    
    
    protected ArrayList<Habilidad> habilidades;


    public Personaje() {
        super(); 
        this.habilidades = new ArrayList<Habilidad>(); 
    }


    public Personaje(int x, int y, int nivelEnergia, int numeroVidas, int capacidadOfensiva, int ancho, int alto, String textura) {
        super(x, y); 
        this.nivelEnergia = nivelEnergia;
        this.numeroVidas = numeroVidas;
        this.capacidadOfensiva = capacidadOfensiva;
        this.ancho = ancho;
        this.alto = alto;
        this.textura = textura;
        this.habilidades = new ArrayList<Habilidad>();
    }

    

    public void caminar(){
        System.out.println("Estas caminando con estilo");
    }
    
    public void correr(){
        System.out.println("Estas corriendo");
    }
    
    public void saltar(){
        System.out.println("estas saltando");
    }
    
    
    public void cambiarCoordenada(int nuevoX, int nuevoY) {
        this.x = nuevoX;
        this.y = nuevoY;
        System.out.println("Te moviste a: " + " x: " +  x + ", " + " y: " + y);
    }

    public void subirDeNivel(){
        this.nivelEnergia++;
        System.out.println("subiste de nivel");
    }
    
    public void disparar(){
        System.out.println("estas disparando");
    }
    
    public void aprenderHabilidad(Habilidad habilidad) {
        this.habilidades.add(habilidad);
        System.out.println("Aprendiste la habilidad: " + habilidad.getNombre());
    }


    public void atacar() {
        System.out.println("Realizaste un ataque");
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    
    
    
    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public int getCapacidadOfensiva() {
        return capacidadOfensiva;
    }

    public void setCapacidadOfensiva(int capacidadOfensiva) {
        this.capacidadOfensiva = capacidadOfensiva;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }
    
    
    
    
    
    
    
    
    
    
}
