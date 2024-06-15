package br.com.alura.aula4.desafio.questao5;

import br.com.alura.aula4.desafio.questao6.Produto;

public class ProdutoFisico extends Produto implements Calculavel {

    public double precoFinal(double preco) {
        return preco * 1.05;
    }
}
