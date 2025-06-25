package javaCore.Gassociacao.test;

import javaCore.Gassociacao.dominio.Jogador;
import javaCore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time1 = new Time("Seleção brasileira");
        Jogador jogador = new Jogador("Lucas");
        Jogador[] jogadores = {jogador};
        jogador.setTime(time1);
        time1.setJogadores(jogadores);

        System.out.println("================== jogadores================");



    }
}
