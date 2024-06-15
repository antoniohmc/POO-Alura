package br.com.alura.aula3.desafios.contabancaria;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setSaldo(2000.0);
        conta.depositar(20.0);
        conta.consultarSaldo();
        System.out.println("\n");
        conta.sacar(20.0);
        conta.consultarSaldo();
        System.out.println("\n");
        conta.cobrarTarifaMensal(13.0);
        conta.consultarSaldo();
    }
}
