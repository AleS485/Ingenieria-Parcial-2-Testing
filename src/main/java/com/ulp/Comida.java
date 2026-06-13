
package com.ulp;


public class Comida extends ObjetoMovil{
    
    private int valorVida;
    private int usos;

    public Comida() {
    }

    
    
    public Comida(int valorVida, int usos) {
        this.valorVida = valorVida;
        this.usos = usos;
    }

    public Comida(int valorVida, int usos, int x, int y) {
        super(x, y);
        this.valorVida = valorVida;
        this.usos = usos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
