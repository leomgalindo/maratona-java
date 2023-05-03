package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    // Vídeo 90 - Orientação Objetos - Polimorfismo pt 01 - Introdução
    // Vídeo 92 - Orientação Objetos - Polimorfismo pt 03 - Parâmetros polimórficos
    public static void calculadoraImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        // Vídeo 93 - Orientação Objetos - Polimorfismo pt 04 - Cast e instanceof
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            // ou String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }
}
