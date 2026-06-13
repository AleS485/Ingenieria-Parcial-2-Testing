
package com.ulp;


public abstract class ObjetoMovil extends Objeto{
    
    public ObjetoMovil(){
        super();
    }

    public ObjetoMovil(int x, int y) {
        super(x, y);
    }
    
    public void cambiarCoordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    
    
    
    
    
    
    
}
