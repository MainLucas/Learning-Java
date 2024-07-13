package javaCore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipo2;

    public Cliente(String nome, TipoCliente tipo2) {
        this.nome = nome;
        this.tipo2 = tipo2;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo2=" + tipo2 +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo2() {
        return tipo2;
    }

    public void setTipo2(TipoCliente tipo2) {
        this.tipo2 = tipo2;
    }
}
