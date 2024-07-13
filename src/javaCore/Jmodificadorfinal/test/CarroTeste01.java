package javaCore.Jmodificadorfinal.test;

import javaCore.Jmodificadorfinal.dominio.Carro;
import javaCore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        Comprador comprador = new Comprador();

        carro.COMPRADOR.setNome("Lucas");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR.getNome());



    }


}
