package javaCore.Eblocosiniciais.dominio;
//Nesta aula iremos aprender sobre blocos de inicialização;
// 1 - Alocado espaço em memória pro objeto
// 2 - Cada Atributo de classe é criado e inicializado com valores default ou a que for passado.
// 3 - Bloco de inicialização é executado
// 4 - Contrutor é executado;
public class Anime {
    private String nome;
    private int[] episodios;

//   {
//       System.out.print("Dentro do bloco de Inicialização ");
//       episodios = new int[100];
//        for (int i = 0; i < episodios.length; i++) {
//           episodios[i] = i+1;
//       }
//    }
    public Anime(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public Anime(){
        episodios = new int[100];
        for (int i:this.episodios){
            System.out.println(i + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
