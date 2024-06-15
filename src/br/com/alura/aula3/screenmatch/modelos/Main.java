package br.com.alura.aula3.screenmatch.modelos;

import br.com.alura.aula3.screenmatch.calculo.Calculadora;

public class Main {

    public static void main(String[] args) {

        Filme favorito = new Filme();
        favorito.setNome("the matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La casa de papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodioPorTemporada(10);
        ;
        serie.setMinutosPorEpisodio(45);

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(serie);
        calculadora.inclui(favorito);

        favorito.fichaTecnica();
        System.out.println("===================");
        outro.fichaTecnica();
        System.out.println("===================");
        serie.fichaTecnica();
        System.out.println("===================");
        System.out.println("DUraçao pra assistir tos os titulos: " + calculadora.getTempoTotal());

    }
}
