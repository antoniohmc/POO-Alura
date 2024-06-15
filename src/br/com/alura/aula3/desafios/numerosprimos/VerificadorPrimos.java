package br.com.alura.aula3.desafios.numerosprimos;

public class VerificadorPrimos extends NumerosPrimos{

    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
