package javaCore.Gassociacao.test;

import javaCore.Gassociacao.dominio.exercicios.Alunos;
import javaCore.Gassociacao.dominio.exercicios.Local;
import javaCore.Gassociacao.dominio.exercicios.Professsores;
import javaCore.Gassociacao.dominio.exercicios.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("Luffy", 23);
        Alunos aluno2 = new Alunos("Lucas", 25);
        Alunos[] alunosParaSeminario = {aluno1, aluno2};
        Local local1 = new Local("Mar");
        Professsores professor1 = new Professsores("Barba Branca", "Rei dos mares");
        Seminario seminario1 = new Seminario("One Piece", alunosParaSeminario,local1);
        Seminario[] seminariosDisponiveis = {seminario1};
        professor1.setSeminarios(seminariosDisponiveis);
        professor1.imprime();
    }
}
