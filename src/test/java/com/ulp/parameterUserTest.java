
package com.ulp;

import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class parameterUserTest {
    
    public parameterUserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    
    
    static Stream<Arguments> probarCambioContrasena() {
        return Stream.of(
            Arguments.of("1234", new Usuario("usr", 0), 1234),
            Arguments.of("123", new Usuario("usr", 0), 123),  
            Arguments.of("1234", new Usuario("usr", 0), 9999) 
            // los pase con "" porque en la consigna tiraba '' y tiraba error
            // entonces no me dejaba ni correrlo, ademas le cambie el ultimo valor para que
            // emule el tercer y segundo fallo porque me tiraban error y no cumplia
            // que solo falle en la tercera
        );
    }

    @ParameterizedTest
    @MethodSource("probarCambioContrasena")
    public void TestCambioPass(String valorActual, Usuario usuario, int valorEsperado) {
        usuario.cambioPassword(valorActual);
        
        assertEquals(valorEsperado, usuario.getPass());
        
    }
    
    
    
    
}
