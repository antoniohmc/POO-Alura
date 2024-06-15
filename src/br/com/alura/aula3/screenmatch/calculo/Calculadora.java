package br.com.alura.aula3.screenmatch.calculo;

import br.com.alura.aula3.screenmatch.modelos.Titulo;

public class Calculadora {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
