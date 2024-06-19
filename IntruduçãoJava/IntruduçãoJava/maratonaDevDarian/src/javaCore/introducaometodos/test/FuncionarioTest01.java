package javaCore.introducaometodos.test;

import javaCore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1500,2000,3000});
        funcionario.imprimi();

        System.out.println("\nmédia: " + funcionario.getMedia());
    }
}
