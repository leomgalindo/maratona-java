package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    // Vídeo 90 - Orientação Objetos - Polimorfismo pt 01 - Introdução
    // Vídeo 91 - Orientação Objetos - Polimorfismo pt 02 - Funcionamento
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
