package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 58 - Orientação Objetos - Construtores pt 01");
        System.out.println("Vídeo 59 - Orientação Objetos - Construtores pt 02 - Sobrecarga");
        Anime anime = new Anime("Haikyuu", "TV", 12, "Esporte");
        anime.imprime();
        System.out.println("---------");
        Anime anime2 = new Anime();
        anime2.imprime();
    }
}
