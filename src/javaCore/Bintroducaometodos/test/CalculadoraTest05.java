package javaCore.Bintroducaometodos.test;

import javaCore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //sem VarArgs é necessário fazer a criação do Array.
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        System.out.println("===============");
        //uma forma de agilizar do código sem precisar fazer um Array para a execução do código.
        calculadora.somaVarArgs(1,2,3,4,5);
    }

}
