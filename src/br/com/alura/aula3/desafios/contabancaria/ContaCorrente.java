package br.com.alura.aula3.desafios.contabancaria;

public class ContaCorrente extends ContaBancaria {

    public double cobrarTarifaMensal(double tarifa) {
        return saldo -= tarifa;
    }
}
