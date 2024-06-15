package br.com.alura.aula2.produto;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Pc");
        produto.setPreco(3000);


        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo preço: " + produto.getPreco());
    }
}
