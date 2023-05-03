package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Local {
    // Vídeo 70 - Orientação Objetos - Associação pt 05 - Exercício Associação
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
