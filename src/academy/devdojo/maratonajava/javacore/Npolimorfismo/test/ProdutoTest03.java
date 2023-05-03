package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        System.out.println("Vídeo 93 - Orientação Objetos - Polimorfismo pt 04 - Cast e instanceof");
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calculadoraImposto(tomate);
        System.out.println("-------------");
        CalculadoraImposto.calculadoraImposto(produto);
    }
}
