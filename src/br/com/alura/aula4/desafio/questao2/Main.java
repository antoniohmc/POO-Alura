package br.com.alura.aula4.desafio.questao2;

/*
Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea()
e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
 */
public class Main {

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        System.out.println("A area da sala é: " + calculadoraSalaRetangular.calcularArea(4, 10));
        System.out.println("O perimetro da sala é: " + calculadoraSalaRetangular.calcularPerimetro(10, 5));
    }
}
