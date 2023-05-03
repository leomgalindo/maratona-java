package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    // Vídeo 84 - Orientação Objetos - Classes abstratas pt 01
    // Vídeo 85 - Orientação Objetos - Classes abstratas pt 02 - Métodos abstratos
    // Vídeo 86 - Orientação Objetos - Classes abstratas pt 03 - Métodos abstratos regras
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
