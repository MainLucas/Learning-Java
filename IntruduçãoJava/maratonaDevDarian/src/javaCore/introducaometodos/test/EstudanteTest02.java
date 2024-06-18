package javaCore.introducaometodos.test;

import javaCore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();
        estudante.nome = "Lukinhas";
        estudante.idade = 23;
        estudante.sexo = 'M';

        estudante01.nome = "Gaby";
        estudante01.idade = 23;
        estudante01.sexo = 'F';

        estudante.imprime();
        estudante01.imprime();
    }
}
