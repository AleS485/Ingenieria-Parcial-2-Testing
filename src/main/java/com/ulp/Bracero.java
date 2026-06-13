
package com.ulp;


public class Bracero extends ObjetoMovil{
    
    
    private int resistencia;

    public Bracero() {
        super();
    }

    public Bracero(int x, int y, int resistencia) {
        super(x, y); 
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    
    
    
    
    
}
