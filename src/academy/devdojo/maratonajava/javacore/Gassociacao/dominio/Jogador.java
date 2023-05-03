package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    // Vídeo 64 - Orientação Objetos - Associação pt 01 - Arrays com Objetos
    // Vídeo 67 - Orientação Objetos - Associação pt 04 - Associação bidirecional
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (time != null){
            System.out.println(time.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
