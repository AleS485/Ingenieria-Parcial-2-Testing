
package com.ulp;

import java.util.ArrayList;


public class Arma extends ObjetoMovil{
    
    private int potencia;
    private int cadenciaDisparo;
    private int velocidadDisparo;
    private int potenciadorOfensiva;
    private int contadorDisparos;

    private ArrayList<Proyectil> proyectilesEquipados;
    
   
    public Arma() {
        super();
        this.contadorDisparos = 0;
        this.proyectilesEquipados = new ArrayList<>(); 
    }
    
    public Arma(int potencia, int cadenciaDisparo, int velocidadDisparo, int potenciadorOfensiva, int contadorDisparos) {
        this.potencia = potencia;
        this.cadenciaDisparo = cadenciaDisparo;
        this.velocidadDisparo = velocidadDisparo;
        this.potenciadorOfensiva = potenciadorOfensiva;
        this.contadorDisparos = contadorDisparos;
        this.proyectilesEquipados = new ArrayList<>();
    }
    
    public Arma(int potencia, int cadenciaDisparo, int velocidadDisparo, int potenciadorOfensiva, int contadorDisparos, int x, int y) {
        super(x, y);
        this.potencia = potencia;
        this.cadenciaDisparo = cadenciaDisparo;
        this.velocidadDisparo = velocidadDisparo;
        this.potenciadorOfensiva = potenciadorOfensiva;
        this.contadorDisparos = contadorDisparos;
        this.proyectilesEquipados = new ArrayList<>();
    }
    
    public void equiparProyectil(Proyectil nuevoProyectil) {
        this.proyectilesEquipados.add(nuevoProyectil);
    }
    
    public void disparar() {
        if (this.contadorDisparos < 30) {
            this.contadorDisparos++;
            System.out.println("Se disparo");
        } else {
            System.out.println("Se rompio el arma");
            this.proyectilesEquipados.clear(); 
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCadenciaDisparo() {
        return cadenciaDisparo;
    }

    public void setCadenciaDisparo(int cadenciaDisparo) {
        this.cadenciaDisparo = cadenciaDisparo;
    }

    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }

    public int getPotenciadorOfensiva() {
        return potenciadorOfensiva;
    }

    public void setPotenciadorOfensiva(int potenciadorOfensiva) {
        this.potenciadorOfensiva = potenciadorOfensiva;
    }

    public int getContadorDisparos() {
        return contadorDisparos;
    }

    public void setContadorDisparos(int contadorDisparos) {
        this.contadorDisparos = contadorDisparos;
    }

    public ArrayList<Proyectil> getProyectilesEquipados() {
        return proyectilesEquipados;
    }

    public void setProyectilesEquipados(ArrayList<Proyectil> proyectilesEquipados) {
        this.proyectilesEquipados = proyectilesEquipados;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
