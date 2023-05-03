package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 90 - Orientação Objetos - Polimorfismo pt 01 - Introdução");
        System.out.println("Vídeo 92 - Orientação Objetos - Polimorfismo pt 03 - Parâmetros polimórficos");
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calculadoraImposto(computador);
        System.out.println("------------");
        CalculadoraImposto.calculadoraImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calculadoraImposto(tv);
    }
}
