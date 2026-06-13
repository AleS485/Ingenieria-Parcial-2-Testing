
package com.ulp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MochilaTest {

    private Mochila mochila;
    
    public MochilaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void antesDeCada(org.junit.jupiter.api.TestInfo testInfo) {
    
        this.mochila = new Mochila();
        System.out.println("EJECUTANDO PRUEBA MOCHILA: " + testInfo.getTestMethod().get().getName());
        System.out.println("----------------------------------------");
    }
    
    @AfterEach
    public void despuesDeCada() {
    }

    @Test // este es el caso a explicado en telegram
    public void testGuardadoObjetosMaximo() {
        Comida c1 = new Comida(10, 1);
        Comida c2 = new Comida(10, 1);
        Comida c3 = new Comida(10, 1);

        this.mochila.agregarObjeto(c1);
        this.mochila.agregarObjeto(c2);
        this.mochila.agregarObjeto(c3);

        assertEquals(3, this.mochila.getItems().size());
    }
    
    @Test // este es el caso b explicado en telegram
    public void testMochilaLlenaException() {
        Comida c1 = new Comida(10, 1);
        Comida c2 = new Comida(10, 1);
        Comida c3 = new Comida(10, 1);
        Comida c4 = new Comida(10, 1);

        this.mochila.agregarObjeto(c1);
        this.mochila.agregarObjeto(c2);
        this.mochila.agregarObjeto(c3);

        try {
            this.mochila.agregarObjeto(c4); 
            fail("SALTA EXCEPCION ARRAYINDEXOUTOFBOUNDS");
        } catch (ArrayIndexOutOfBoundsException errorTamano) {
            assertNotNull(errorTamano.getMessage());
        }
    }
    
    @Test // este es el caso c explicado en telegram
    public void testAmpliacionYGuardarMochila() {
        Comida c1 = new Comida(10, 1);
        Comida c2 = new Comida(10, 1);
        Comida c3 = new Comida(10, 1);
        Comida c4 = new Comida(10, 1);

        this.mochila.agregarObjeto(c1);
        this.mochila.agregarObjeto(c2);
        this.mochila.agregarObjeto(c3);

        this.mochila.ampliarCapacidad(5); 
        this.mochila.agregarObjeto(c4);
        
        assertEquals(4, this.mochila.getItems().size());
    }
    
}
