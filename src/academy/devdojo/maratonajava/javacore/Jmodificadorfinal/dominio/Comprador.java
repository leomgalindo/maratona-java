package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Comprador {
    // Vídeo 78 - Orientação Objetos - Modificador final pt 02 - Tipo referência
    private String nome;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
