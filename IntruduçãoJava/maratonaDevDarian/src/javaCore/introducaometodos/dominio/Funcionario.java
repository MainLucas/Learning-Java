package javaCore.introducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Funcionario {
    public String nome;
    public int idade;
    public  double[] salarios;


    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double num:salarios){
            System.out.print(num + " ");
        }
    }
    public void imprimeMediaSalarial(){
        double media = 0;
        for(double num:salarios){
            media += num;
        }
        media /= salarios.length;
        System.out.println("\nMédia Salarial " + media);
    }
}
