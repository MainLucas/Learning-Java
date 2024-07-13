package javaCore.Gassociacao.dominio.exercicios;

public class Professsores {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professsores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professsores(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Professor: " + this.nome);
        if (seminarios == null) return;
        System.out.println("Seminarios");
        for (Seminario seminario : this.seminarios){
            System.out.println("Título: " + seminario.getTitulo() + " Local: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("====Alunos====");
            for (Alunos aluno : seminario.getAlunos()){
                System.out.println("Aluno: " + aluno.getNome()+" Idade: " + aluno.getIdade());
            }
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }


    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
