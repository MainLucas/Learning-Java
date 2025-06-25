package com.javaHardCore.EintroducaoExcecoes.Aula01.dominio;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        if (nome == (null) || nome.isBlank()){
            throw new NullPointerException("O nome não pode estar vazio e ser nulo.");
        }
        this.nome = nome;
        if (idade < 0){
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
