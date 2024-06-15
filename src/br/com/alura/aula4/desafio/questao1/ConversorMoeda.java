package br.com.alura.aula4.desafio.questao1;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double coverterDolarParaReal(double valorDolar) {
        return (valorDolar * 5.16);
    }
}
