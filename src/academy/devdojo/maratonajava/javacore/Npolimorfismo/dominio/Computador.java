package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    // Vídeo 90 - Orientação Objetos - Polimorfismo pt 01 - Introdução
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
