package javaCore.Hheranca.dominio;

public class Funcionario extends Pessoa { //extendendo uma classe
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 1.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 2.");
    }
    public Funcionario(String nome){
        super (nome);
        System.out.println("dentro do construtor de funcionário");
    }
    public void imprime(){
        super.imprime(); // Aqui podemos sobreescrever o metodo imprime na classse Pessoa.
        System.out.println("Salário: " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

}
