package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    // Vídeo 71 - Orientação Objetos - Herança pt 01
    // Vídeo 72 - Orientação Objetos - Herança pt 02 - Super
    // Vídeo 73 - Orientação Objetos - Herança pt 03 - protected
    // Vídeo 74 - Orientação Objetos - Herança pt 04 - Construtores
    // Vídeo 75 - Orientação Objetos - Herança pt 05 - Sequência de inicialização
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
