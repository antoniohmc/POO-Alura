package br.com.alura.aula3.desafios.numerosprimos;

public class Main {

    public static void main(String[] args) {
        VerificadorPrimos verificador = new VerificadorPrimos();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
