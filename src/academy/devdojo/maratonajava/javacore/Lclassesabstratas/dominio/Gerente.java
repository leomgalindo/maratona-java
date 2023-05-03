package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    // Vídeo 84 - Orientação Objetos - Classes abstratas pt 01
    // Vídeo 85 - Orientação Objetos - Classes abstratas pt 02 - Métodos abstratos

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }
}
