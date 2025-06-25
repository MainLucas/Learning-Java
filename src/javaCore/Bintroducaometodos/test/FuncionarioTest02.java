package javaCore.Bintroducaometodos.test;

import javaCore.Bintroducaometodos.dominio.Funcionario02;

public class FuncionarioTest02 {
    public static void main(String[] args) {

        Funcionario02 funcionario = new Funcionario02();
        funcionario.nome = "Lucas";
        funcionario.idade = 23;
        funcionario.salario = new double[]{1500,6000,2000};
        funcionario.imprimeSalarios();
    }

}
