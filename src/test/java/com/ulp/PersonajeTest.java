
package com.ulp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PersonajeTest {

    private Heroe heroe;
    private Enemigo enemigo;
    
    public PersonajeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void antesDeCada(org.junit.jupiter.api.TestInfo testInfo) {
    
        this.heroe = new Heroe(0, 0, 1, 1, 20, 10, 10, "nose.png", "Artorias", new Mochila());
        this.enemigo = new Enemigo(0, 0, 1, 1, 10, 10, 10, "nose2.png", false);
        System.out.println("EJECUTANDO PRUEBA: " + testInfo.getTestMethod().get().getName());
        System.out.println("----------------------------");
        
    }
    
    @AfterEach
    public void despuesDeCada() {
        System.out.println("----------------------------");
    }

    @Test // este es el caso a explicado en telegram 
    public void testGolpeCombatirNoMata() {
        
        this.enemigo.setVida(100);
        this.heroe.combatir(this.enemigo);
        assertEquals(80, this.enemigo.getVida());
        
    }

    @Test   // este es el caso b explicado en telegram 
    public void testGolpeCombatirMataEnemigo() {
        
        this.enemigo.setVida(30);
        this.heroe.setCapacidadOfensiva(30);
        this.heroe.combatir(this.enemigo);
        assertEquals(0, this.enemigo.getVida());
        
    }
    
    @Test // este es el caso c explicado en telegram 
    public void testGolpeDanoMuyGrande() {
        
        this.enemigo.setVida(10);
        this.heroe.setCapacidadOfensiva(50);
        this.heroe.combatir(this.enemigo);
        assertEquals(0, this.enemigo.getVida());
        
    }
     
    @Test // este es el caso d
    public void testCurarVida() {
        this.heroe.setVida(30); 
        Comida manzana = new Comida(15, 1); 
        
        this.heroe.curarVida(manzana);
        assertEquals(45, this.heroe.getVida()); 
    }
    
    @Test   // aca compruebo el tema de que el personaje coma y llegue al limite de vida (estaba en telegram)
    public void testCuracionPorComidaMaxima() {
        this.heroe.setVida(80); 
        Comida manzana = new Comida(50, 1); 
        this.heroe.curarVida(manzana);
        assertEquals(100, this.heroe.getVida());
    }
    
    @Test // este es el caso e
    public void testNoPuedeCurarse() {
        assertThrows(NullPointerException.class, () -> {
            this.heroe.curarVida(null);
        });
    }
    
    
}
