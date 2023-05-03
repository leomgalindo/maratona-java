package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    // Vídeo 71 - Orientação Objetos - Herança pt 01
    // Vídeo 73 - Orientação Objetos - Herança pt 03 - protected
    // Vídeo 74 - Orientação Objetos - Herança pt 04 - Construtores
    // Vídeo 75 - Orientação Objetos - Herança pt 05 - Sequência de inicialização
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Pessoa 2");
    }
    public Pessoa(String nome){
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
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
