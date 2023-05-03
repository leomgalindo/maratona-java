package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    // Vídeo 64 - Orientação Objetos - Associação pt 01 - Arrays com Objetos
    // Vídeo 67 - Orientação Objetos - Associação pt 04 - Associação bidirecional
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null) {
            return;
        }
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
