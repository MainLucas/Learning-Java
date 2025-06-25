package javaCore.Dconstrutores.test;

import javaCore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen", "tv", 40,"Ação", "Darianzin News");
        anime.imprime();
    }
}
