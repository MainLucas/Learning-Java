package javaCore.Fmodificadoresestaticos.test;

import javaCore.Fmodificadoresestaticos.domain.Carro;
//Modificador static: vai fazer o atributo pertencer a classe; e todos os objetos vão compartilhar o mesmo valor;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(188);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
