package br.com.alura.aula2.idadepessoa;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {
        if (idade > 18) {
            System.out.println(nome + " é " + "Maior de idade");
        } else
            System.out.println(nome + " é " + "Menor de idade");
    }
}
