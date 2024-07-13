package javaCore.Hheranca.dominio;

public class Pessoa {
    protected String nome;      //alterando para protected eu consigo ter acesso em outras classes atraves do extend ou associação
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2.");
    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + " " + this.endereco.getCep());

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
