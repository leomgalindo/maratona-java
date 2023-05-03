package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    // Vídeo 53 - Orientação Objetos - Métodos pt 10 - Exercise
    // Vídeo 56 - Orientação Objetos - Modificador de acesso private, get e set pt 03

    private String nome;
    private int idade;
    private double[] salarios;
    private double somaSalario;
    private double mediaSalario;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        imprimirMediaSalario();
    }

    public void imprimirMediaSalario() {
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            somaSalario += salario;
        }
        mediaSalario = somaSalario / this.salarios.length;
        System.out.println("\nMédia salarial: " + mediaSalario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
