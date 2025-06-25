package javaCore.Aintroducaoclasses.test;

import javaCore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Lucas";
        professor.idade = 23;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + ", idade: " + professor.idade + " e sexo: " + professor.sexo + ".");

    }
}
