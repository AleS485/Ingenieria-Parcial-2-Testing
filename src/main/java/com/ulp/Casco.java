
package com.ulp;


public class Casco extends ObjetoMovil{
    
    private int resistencia;

    
    public Casco() {
        super(); 
        this.resistencia = 10;
    }

    
    public Casco(int x, int y, int resistencia) {
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
