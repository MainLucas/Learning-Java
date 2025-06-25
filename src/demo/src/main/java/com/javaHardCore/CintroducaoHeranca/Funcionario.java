package com.javaHardCore.CintroducaoHeranca;

public class Funcionario extends Pessoa{
    private Float salario;
    private String cargaHoraria;

    public Funcionario(String nome, char sexo, String cargaHoraria, Float salario ) {
        super(nome, sexo);
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }
    
    
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


}
