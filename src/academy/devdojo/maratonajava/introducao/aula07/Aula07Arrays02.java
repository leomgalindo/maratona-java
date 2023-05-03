package academy.devdojo.maratonajava.introducao.aula07;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        System.out.println("Vídeo 33 - Arrays pt 02");
        System.out.println("Vídeo 34 - Arrays pt 03");
        /*
        Cada tipo primitivo é inicializado de uma maneira
            -byte, short, int, long, float, double - iniciam com 0
            -char inicia com '\u0000'
            -boolean false
            -String inicia com null
         */
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
