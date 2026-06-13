
package com.ulp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
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


public class parameterMailTest {
    
    public parameterMailTest() {
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
    
    
    public static boolean ValidarMail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    
    static Stream<Arguments> proveerMailsParaTest() {
        return Stream.of(
            Arguments.of("jorgesys@tototita.com"),  
            Arguments.of("jorgesystototitacom"),  
            Arguments.of("jorgesystototita.com"), 
            Arguments.of("@jorgesystototita.com"),
            Arguments.of(".jorgesystototita@com") 
        );
    }
    // trate de copiar lo que pedia la consigna y me da todos en verde
    // probe algunos cambios en el pattern pero tampoco funciona
    // trate de agregar true y false al lado de cada arguments con el mail
    // pero aun asi seguia igual, me da todo en verde y no toma el primero
    // como true y los demas en false.
    @ParameterizedTest
    @MethodSource("proveerMailsParaTest")
    public void testValidarEmail(String emailInput) {
        boolean resultadoReal = ValidarMail(emailInput);
        
        assertFalse(resultadoReal);
    }
    
    
    
    
    
    
    
    
}
