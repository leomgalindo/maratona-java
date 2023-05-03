package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    // Vídeo 58 - Orientação Objetos - Construtores pt 01
    // Vídeo 59 - Orientação Objetos - Construtores pt 02 - Sobrecarga
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
