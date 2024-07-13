package javaCore.Hheranca.test;

import javaCore.Hheranca.dominio.Endereco;
import javaCore.Hheranca.dominio.Funcionario;
import javaCore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 03");
        endereco1.setRua("82590-103");

        Pessoa pessoa = new Pessoa("Lucas");
        pessoa.setCpf("1185949192");
        pessoa.setEndereco(endereco1);
        pessoa.imprime();
        System.out.println("=========");
        Funcionario funcionario = new Funcionario("Pedro");
        funcionario.setCpf("1100000");
        funcionario.setEndereco(endereco1);
        funcionario.setSalario(1562.22);
        funcionario.imprime();
    }

}
