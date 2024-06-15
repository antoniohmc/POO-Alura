package br.com.alura.aula4.desafio.questao2;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double altura, double largura) {
       return altura * largura;
    }

    @Override
    public double calcularPerimetro(int ladosA, int ladosB) {
        return 2 * (ladosA + ladosB);
    }
}
