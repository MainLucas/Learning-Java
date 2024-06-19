package javaCore.introducaoclasses.test;

import javaCore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.ano = 2012;
        carro1.modelo = "Bola";

        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("==========================carro 02==========================");

        carro2.nome = "Civic";
        carro2.ano = 2015;
        carro2.modelo = "EXL";

        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);


    }
}
