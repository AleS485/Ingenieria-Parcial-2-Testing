
package com.ulp;


public class Proyectil {
    
    private int cantidad;
    private int danioCausado;
    private String efecto; // congela, quema, envenena
    
    public Proyectil() {
    }
    
    public Proyectil(int cantidad, int danioCausado, String efecto) {
        this.cantidad = cantidad;
        this.danioCausado = danioCausado;
        this.efecto = efecto;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDanioCausado() {
        return danioCausado;
    }

    public void setDanioCausado(int danioCausado) {
        this.danioCausado = danioCausado;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
    
    
    
    
    
    
    
    
    
}
