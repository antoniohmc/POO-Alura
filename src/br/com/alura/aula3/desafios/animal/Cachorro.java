package br.com.alura.aula3.desafios.animal;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au !!!");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo....");
    }
}
