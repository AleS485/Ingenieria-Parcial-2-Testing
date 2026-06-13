
package com.ulp;


public class Armadura {
    
    private int duracion;

    private Casco casco;
    private Bracero[] braceros;
    private CubrePierna[] cubrePiernas;
    
    
    
    
    public Armadura() { // puse esto para un valor de inicio
        this.duracion = 100;
        this.braceros = new Bracero[2];       
        this.cubrePiernas = new CubrePierna[2]; 
    }
    
    
    public void equiparCasco(Casco casco) {
        this.casco = casco;
        System.out.println("EQUIPASTE EL CASCO");
    }
    
    public void equiparBracero(Bracero bracero) {
        boolean equipado = false;
        for (int i = 0; i < this.braceros.length; i++) {
            if (this.braceros[i] == null) {
                this.braceros[i] = bracero;
                equipado = true;
                System.out.println("Bracero " + (i + 1) + ", se equipo");
                break;
            }
        }
        if (!equipado) {
            System.out.println("YA EQUIPASTE 2 BRACEROS");
        }
    }
    
    public void equiparCubrePierna(CubrePierna cubrepierna) {
        boolean equipado = false;
        for (int i = 0; i < this.cubrePiernas.length; i++) {
            if (this.cubrePiernas[i] == null) {
                this.cubrePiernas[i] = cubrepierna;
                equipado = true;
                System.out.println("CubrePiernas " + (i + 1) + ", se equipo");
                break;
            }
        }
        if (!equipado) {
            System.out.println("TE EQUIPASTE LOS 2 CUBREPIERNAS, NO PODES EQUIPAR MAS");
        }
    }
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Casco getCasco() {
        return casco;
    }

    public Bracero[] getBraceros() {
        return braceros;
    }

    public CubrePierna[] getCubrePiernas() {
        return cubrePiernas;
    }
    
    
    
    
    
}
