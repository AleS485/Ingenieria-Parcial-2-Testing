
package com.ulp;


public class Usuario {
    
    private String user;
    private int pass;
    
    public Usuario() {
    }
    
    public Usuario(String user, int pass) {
        this.user = user;
        this.pass = pass;
    }
    
    public String getUser() {
        return user;
    }

    public int getPass() {
        return pass;
    }
    
    public boolean validarPassword(int contra) {
        if(this.pass == contra){
            return true;
        } else{
            return false;
        }
    }
    
    public void cambioPassword(String newPass) {
        this.pass = Integer.parseInt(newPass);
    }
    
    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }
    
    public boolean usuariosDiferentes(Usuario u2) {
        
        if(this != u2){
            return true; 
        } else{
            return false;
        }
    }
    
    
    
    
    
    
}
