package javaCore.Fmodificadoresestaticos.domain;

// bloco de inicialização estático é carregado apenas uma vez quando a classe é carregada pela jvm
//Nesta aula iremos aprender sobre blocos de inicialização;
// 0 - Bloco de inicialização é executado quando a JVM carregar a classe;
// 1 - Alocado espaço em memória pro objeto
// 2 - Cada Atributo de classe é criado e inicializado com valores default ou a que for passado.
// 3 - Bloco de inicialização é executado
// 4 - Contrutor é executado;
public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.print("\nDentro do bloco de Inicialização ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Anime() {
        episodios = new int[101];
        for (int i = 0; i < Anime.episodios.length ; i++) {
            System.out.print(i + " ");
        }
    }
    public int[] getEpisodios() {
        return episodios;
    }
}
