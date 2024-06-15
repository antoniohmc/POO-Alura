package br.com.alura.aula3.desafios.contabancaria;

/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
 */
public class ContaBancaria {

    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual: " + saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
