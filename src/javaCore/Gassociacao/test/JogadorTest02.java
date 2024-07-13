package javaCore.Gassociacao.test;

import javaCore.Gassociacao.dominio.Jogador;
import javaCore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador.setTime(time);

    }
}
