package br.com.alura.aula4.desafio.questao5;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();

        System.out.println("Preco final do livro é: " + livro.precoFinal(100));
        System.out.println("Preço final do produto é: " + produtoFisico.precoFinal(230));
    }
}
