
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
            Arguments.of("1234", new Usuario("usr", 0), 1234, true),
            Arguments.of("123", new Usuario("usr", 0), 1234, false),
            Arguments.of("4241", new Usuario("usr", 0), 1234, false) // le agregue boolean
        );
    }

    @ParameterizedTest
    @MethodSource("probarCambioContrasena")
    public void TestCambioPass(String valorActual, Usuario usuario, int valorEsperado, boolean verificacionCambio) {
        usuario.cambioPassword(valorActual);
        
        if(verificacionCambio){
            assertEquals(valorEsperado, usuario.getPass());
        } else{
            assertNotEquals(valorEsperado, usuario.getPass());
        }
        
    }
    
    
    
    
}
