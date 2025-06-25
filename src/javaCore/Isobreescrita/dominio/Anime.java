package javaCore.Isobreescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString(){ //Fazendo a sobreescrita para imprimir o nome direto ao inves do nome da campo armazenado;
        return this.nome;     //Temos a opção de fazer criar o método toString atraves do alt + insert
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
