package org.infnet;

import org.infnet.converter.TemperatureConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterCornerCaseTest {
    private TemperatureConverter converter;
    @BeforeEach
    public void setUp(){
        converter = new TemperatureConverter();
    }
    @Test
    @DisplayName("Deve conveter um valor negativo")
    void testCelsiusToFahrenheitNegative(){
        assertEquals(-40, converter.celsiusToFahrenheit(-40));
    }
    @Test
    @DisplayName("Deve conveter um valor negativo de Fahrenhreit")
    void testFahrenheitToCelsiusNegative(){
        assertEquals(-40, converter.fahrenheitToCelsius(-40));
    }
    @Test
    void testCelciusToKelvinAbsoluteZero(){
        assertEquals(0, converter.celsiusToKelvin(-273.15),0.001);
    }
}
