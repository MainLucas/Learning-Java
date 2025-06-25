package javaCore.Bintroducaometodos.dominio;

public class Funcionario02 {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeSalarios(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        double soma = 0;
        for(double num:salario){
            System.out.print(num + " ");
            soma += num;
        }
        System.out.println(soma);

    }
}
