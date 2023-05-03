package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 60 - Orientação Objetos - Blocos de inicialização");
        Anime anime = new Anime("One Piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
