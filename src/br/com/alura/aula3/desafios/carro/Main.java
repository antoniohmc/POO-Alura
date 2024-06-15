package br.com.alura.aula3.desafios.carro;

public class Main {

    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.definirModelo("Pegeout");
        meuCarro.definirPrecos(17000, 15000, 12000);
        meuCarro.exibirInfo();
    }
}
