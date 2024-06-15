package br.com.alura.aula4.desafio.questao4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override

    public int celsiusParaFahrenheit(int grausCelcius) {
        return (grausCelcius * 9 / 5) + 32;
    }

    @Override
    public int FahrenheitParaCelcius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
