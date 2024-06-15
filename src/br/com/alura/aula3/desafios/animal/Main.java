package br.com.alura.aula3.desafios.animal;

public class Main {

    public static void main(String[] args) {

        Cachorro lupi = new Cachorro();
        Gato lua =  new Gato();

        lupi.emitirSom();
        lupi.abanarRabo();
        System.out.println("=============");
        lua.arranharMoveis();
        lua.emitirSom();
    }
}
