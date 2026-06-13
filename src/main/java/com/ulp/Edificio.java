
package com.ulp;


public class Edificio extends ObjetoInmovil{
    
    
    private int vida;
    private int resistenciaDisparos;
    
    public Edificio(){
        super();
    }

    public Edificio(int x, int y, int vida, int resistenciaDisparos) {
        super(x, y);
        this.vida = vida;
        this.resistenciaDisparos = resistenciaDisparos;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getResistenciaDisparos() {
        return resistenciaDisparos;
    }

    public void setResistenciaDisparos(int resistenciaDisparos) {
        this.resistenciaDisparos = resistenciaDisparos;
    }
    
    
    
    
    
    
    
    
    
    
    
}
