package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    // Vídeo 66 - Orientação Objetos - Associação pt 03 - Associação unidirecional muitos para um
    // Vídeo 70 - Orientação Objetos - Associação pt 05 - Exercício Associação
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Professor: " + this.nome + ", especialidade: " + this.especialidade);
        if (this.seminarios == null) return;
        System.out.println("--- Seminários cadastrados ---");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            if(seminario.getLocal() == null) continue;
            System.out.println(seminario.getLocal().getEndereco());
            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("--- Alunos ---");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + ", idade: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
