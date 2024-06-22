package javaCore.Bintroducaometodos.test;

import javaCore.Bintroducaometodos.dominio.Estudante;
import javaCore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Lukinhas";
        estudante.idade = 23;
        estudante.sexo = 'M';

        estudante01.nome = "Gaby";
        estudante01.idade = 23;
        estudante01.sexo = 'F';


        impressora.imprime(estudante);
        impressora.imprime(estudante01);
    }
}
