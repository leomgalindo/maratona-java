package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    // Vídeo 77 - Orientação Objetos - Modificador final pt 01 - Tipo primitivo
    // Vídeo 78 - Orientação Objetos - Modificador final pt 02 - Tipo referência
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
