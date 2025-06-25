package com.javaHardCore.EintroducaoExcecoes.Aula01.test;


import com.javaHardCore.EintroducaoExcecoes.Aula01.dominio.Divisao;

import java.util.InputMismatchException;

public class Test02 {
    public static void main(String[] args ){
        int dividendo = 0;
        int divisor = 0;
        boolean loop = true;

        do {
           try{
               System.out.println("Digite o dividendo:\n ");
               dividendo = Divisao.ler.nextInt();
//               if(){
//
//               }
               System.out.println("Digite o divisor: \n");
               divisor = Divisao.ler.nextInt();
               Test02.divideValores(dividendo, divisor);

               loop = false;

           } catch (InputMismatchException e){
               System.err.println("Erro: " + e);
               Divisao.ler.nextLine();
               System.out.println("Digite valores inteiros!");

           } catch (ArithmeticException e){
//               System.err.println("Erro" + e);
//               Divisao.ler.nextLine();
//               System.out.println("\n Erro ao dividir por 0");
               ;
           }finally {
               System.out.println("Utilizado para recursos do sistema. ex: Finalizar conexão com o banco de dados.");
           }

        }while(loop);


    }
    public static void divideValores(int dividendo, int divisor){
        System.out.println("Resultado: " + (dividendo / divisor));
    }


}
