package br.com.alura.aula2.livro;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setTitulo("Diario de um banana");
        livro.setAutor("Nao sei kkkk");

        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
    }
}
