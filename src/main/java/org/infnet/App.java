package org.infnet;

import org.infnet.converter.TemperatureConverter;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        TemperatureConverter tc = new TemperatureConverter();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura");
        double entrada = leitor.nextDouble();
        double retorno = tc.celsiusToFahrenheit(entrada);
        System.out.println(retorno);
        tc.kelvinToCelsius(-33);
    }
}
