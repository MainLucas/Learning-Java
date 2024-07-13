package javaCore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    //Contrutores;
    public Time(String nome) {
        this.nome = nome;
    }
    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }
    public void imprime(){
        System.out.println(this.nome);
        if(this.nome == null) return;
        for(Jogador jogadore: jogadores){
            System.out.println(jogadore.getNome());
        }
    }

    //métodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
