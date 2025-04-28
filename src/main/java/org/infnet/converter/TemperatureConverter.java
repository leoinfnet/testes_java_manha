package org.infnet.converter;

import org.infnet.exception.TemperaturaInvalidaException;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        double intermediario = celsius * 9 / 5;
        return intermediario + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        //if (kelvin < 0) throw new IllegalArgumentException("Temperature below absolute zero");
        if (kelvin < 0) throw new TemperaturaInvalidaException("Temperature below absolute zero");
        return kelvin - 273.15;
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }
}
