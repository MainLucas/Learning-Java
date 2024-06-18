package javaCore.introducaometodos.dominio;

public class Calculadora {

     //métodos
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }
    public void multiplicaDoisNUmeros(int num1,int num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros (double num1, double num2){
        return num1 / num2;
    }
    public void imprimeDivisaoDeDoisNumeros(double num1,double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por 0");
             return; // podemos utilizar o return ao inves do else em algumas situações
        }
        System.out.println(num1 / num2);
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
    public void somaArray(int[]numeros){
        int soma = 0;
        for(int num:numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    //uma forma de agilizar do código sem precisar fazer um Array para a execução do código.
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num:numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
