
package com.ulp;

import java.time.Duration;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    
    private static Usuario usr;
    private static int i = 1;
    
    
    public UsuarioTest() {
    }
    
    @BeforeAll
    public static void antesDeTodo() {
        usr = new Usuario("Juanjo", 1212);
        System.out.println("TEST de usuario");
    }
    
    @AfterAll
    public static void despuesDeTodo() {
        LocalDate hoy = LocalDate.now();
        LocalDate ayer = hoy.minusDays(1);
        
        LocalDate fechaAyerImprimida = LocalDate.of(ayer.getYear(),ayer.getMonthValue(), ayer.getDayOfMonth());
        
        System.out.println("Fin de las pruebas : " + fechaAyerImprimida);
    }
    
    @BeforeEach
    public void antesDeCadaTest() {
        System.out.println("-------------------");
        System.out.println("Este es el test numero: " + i);
        i++;
        
    
    }
    
    
    @AfterEach
    public void despuesDeCadaTest() {
        System.out.println("--------------------");
    }

    @Test
    public void testValidarUser() {
        int contrasenaCreada = 2222;
        boolean resultadoValidacion = usr.validarPassword(contrasenaCreada);
        
        Assertions.assertTrue(resultadoValidacion); 

        
    }

    @Test
    public void testValidarEmail() {
        
        String mailPrueba = "juanjo@ulp.edu.ar";
        boolean verificacionRequisitosMail = mailPrueba.contains("@") && mailPrueba.contains(".") && mailPrueba.length() < 20;
        
        Assertions.assertTrue(verificacionRequisitosMail);
        // espero un mail valido
    }

    @Test
    public void testCambioPass() {
    
        String newPass = "1234";
        usr.cambioPassword(newPass);
        System.out.println("La contrasena se cambio.");
        Assertions.assertEquals(1234, usr.getPass());
    }

    @Test
    public void testDelay() throws InterruptedException{
    
        assertTimeout(Duration.ofMillis(30), () -> {
            usr.delay(50);
        });


    }

    
    @Test
    public void testUsuariosDiferentes(){
        
        Usuario u1 = new Usuario("Pedro", 4444);
        Usuario u2 = new Usuario("Ana", 5555);
        assertTrue(u1.usuariosDiferentes(u2));
        assertNotSame(u1, u2, "mismo usuario");
        
        
    }
    
}
