package org.infnet;

import org.infnet.converter.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterHappyPathTests {
    private TemperatureConverter converter;
    @BeforeEach
    public void setUp(){
        converter = new TemperatureConverter();
    }
    @Test
    @DisplayName("Deve converter de celsius para Fahrenheit")
    public void testCelsiusToFahrenheit(){
        assertEquals(32,converter.celsiusToFahrenheit(0));
    }
    @Test
    @DisplayName("Deve converter de celsius para Kelvin")
    public void testCelsiusToKelvin(){
        assertEquals(273.15,converter.celsiusToKelvin(0));
    }
    @Test
    @DisplayName("Deve converter de Fahrenhreit para Celsius")
    public void testFahrenheitToCelsius(){
        assertEquals(0,converter.fahrenheitToCelsius(32));
    }
    @Test
    @DisplayName("Deve converter de Fahrenhreit para Kelvin")
    public void testFahrenheitToKelvin(){
        assertEquals(255.372,converter.fahrenheitToKelvin(0),0.001);
    }
    @Test
    @DisplayName("Deve converter de Kelvin para Celsius")
    public void kelvinToCelsius(){
        assertEquals(-263.15,converter.kelvinToCelsius(10),0.001);
    }
    @Test
    @DisplayName("Deve converter de Kelvin para Celsius")
    public void kelvinToFahrenheit(){
        assertEquals(-441.67,converter.kelvinToFahrenheit(10),0.001);
    }

}
