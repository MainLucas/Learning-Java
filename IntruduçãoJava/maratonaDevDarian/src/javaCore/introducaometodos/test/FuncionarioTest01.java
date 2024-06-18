package javaCore.introducaometodos.test;

import javaCore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Lucas";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1500,2000,3000};
        funcionario.imprimi();

        funcionario.imprimeMediaSalarial();
    }
}
