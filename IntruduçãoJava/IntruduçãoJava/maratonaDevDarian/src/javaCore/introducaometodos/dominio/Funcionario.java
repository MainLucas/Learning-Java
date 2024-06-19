package javaCore.introducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double num : salarios) {
            System.out.print(num + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }

        for (double num : salarios) {
            media += num;
        }
        media /= salarios.length;

    }

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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
