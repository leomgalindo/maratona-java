package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    // Vídeo 92 - Orientação Objetos - Polimorfismo pt 03 - Parâmetros polimórficos
    private static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
