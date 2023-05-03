package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;

public class Desenvolvedor extends Funcionario {
    // Vídeo 84 - Orientação Objetos - Classes abstratas pt 01
    // Vídeo 85 - Orientação Objetos - Classes abstratas pt 02 - Métodos abstratos

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }
}
