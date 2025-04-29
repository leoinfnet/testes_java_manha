package org.infnet;

import org.infnet.converter.TemperatureConverter;
import org.infnet.exception.TemperaturaInvalidaException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemperatureConverterExceptionTests {
    private TemperatureConverter converter;
    @BeforeEach
    public void setUp(){
        converter = new TemperatureConverter();
    }
    @Test
    @DisplayName("Deve disparar uma exception pois não ha kelvin negativo")
    void testKelvinToCelsiusNegativeKelvin(){
        TemperaturaInvalidaException exp = assertThrows(TemperaturaInvalidaException.class, () -> {
            converter.kelvinToCelsius(-5);
        });
        assertEquals("Temperature below absolute zero",exp.getMessage());
    }
}
