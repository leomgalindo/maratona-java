package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 57 - Orientação Objetos - Sobrecarga de métodos");
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
