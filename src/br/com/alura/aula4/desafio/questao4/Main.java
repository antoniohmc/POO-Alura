package br.com.alura.aula4.desafio.questao4;

/*
Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
 */
public class Main {

    public static void main(String[] args) {
        ConversorTemperaturaPadrao temperaturaPadrao = new ConversorTemperaturaPadrao();

        System.out.println(temperaturaPadrao.celsiusParaFahrenheit(20));
        System.out.println(temperaturaPadrao.FahrenheitParaCelcius(20));
    }
}
