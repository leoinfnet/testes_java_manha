package org.infnet;

import org.infnet.converter.TemperatureConverter;
import org.infnet.exception.TemperaturaInvalidaException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TesperatureConverterTest {

    //Setup
    TemperatureConverter tc;
//    @BeforeAll
//    static void init(){
//        System.out.println("Uma Vez!");
//    }
    @BeforeEach
    void setup(){
        tc = new TemperatureConverter();
    }

    @Test
    void testCelciusToFahrenheit(){
        //execução
        System.out.println("Metodo1");
        double resultado = tc.celsiusToFahrenheit(0);
        double resultado2 = tc.celsiusToFahrenheit(1000);
        double resultado3 = tc.celsiusToFahrenheit(-35);
        //Assertion
        assertEquals(32,resultado);
        assertEquals(1832,resultado2);
        assertEquals(-31,resultado3);
    }
    @Test
    public void testFanhrenheitToCelcius(){
        System.out.println("Metodo2");
        double resultado = tc.fahrenheitToCelsius(0);
        assertEquals(-17.7778,resultado,0.0001);

    }
    @Test
    public void testCelsiusToKelvin(){
        assertEquals(373.15,tc.celsiusToKelvin(100));
    }
    @Test
    void testKelvinToCelciusNegative(){
        TemperaturaInvalidaException temperaturaInvalidaException = assertThrows(TemperaturaInvalidaException.class, () -> {
            tc.kelvinToCelsius(-5);
        });
        assertEquals("Temperature below absolute zero",
                temperaturaInvalidaException.getMessage());
    }
//    //Teardown
//    @AfterEach
//    void tearDown(){
//        System.out.println("Apos cada um");
//    }
//    @AfterAll
//    static void destroy(){
//        System.out.println("Ao final de todos");
//    }
}
