
package com.ulp;


public class CubrePierna extends ObjetoMovil{
    
    private int resistencia;

    public CubrePierna() {
        super();
    }

    public CubrePierna(int x, int y, int resistencia) {
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
