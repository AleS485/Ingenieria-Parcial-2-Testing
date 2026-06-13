
package com.ulp;


public class Muralla extends ObjetoInmovil{
    
    private int nivelRecuperacion;
    private String mejoraDefensa;

    public Muralla() {
    }

    
    

    public Muralla(int nivelRecuperacion, String mejoraDefensa, int x, int y) {
        super(x, y);
        this.nivelRecuperacion = nivelRecuperacion;
        this.mejoraDefensa = mejoraDefensa;
    }

    public int getNivelRecuperacion() {
        return nivelRecuperacion;
    }

    public void setNivelRecuperacion(int nivelRecuperacion) {
        this.nivelRecuperacion = nivelRecuperacion;
    }

    public String getMejoraDefensa() {
        return mejoraDefensa;
    }

    public void setMejoraDefensa(String mejoraDefensa) {
        this.mejoraDefensa = mejoraDefensa;
    }
    
    
    
    
    
    
    
    
    
}
