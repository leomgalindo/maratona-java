package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 53 - Orientação Objetos - Métodos pt 10 - Exercise");
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Leo");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1000, 2000, 3000});

        funcionario.imprimir();
    }
}
