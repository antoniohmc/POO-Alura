package br.com.alura.aula4.desafio.questao1;

/*
Crie uma classe ConversorMoeda que implementa uma interface
ConversaoFinanceira com o método converterDolarParaReal() para converter
um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
 */
public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        System.out.println("O valor convertido em real fica: " + conversorMoeda.coverterDolarParaReal(10));
    }
}
