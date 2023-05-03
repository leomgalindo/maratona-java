package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    // Vídeo 63 - Orientação Objetos - Bloco de inicialização estático
    private String nome;
    private static int[] episodios;
    // 1- Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 2- Alocado espaço em memória pro objeto
    // 3- Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 4- Bloco de inicialização é executado
    // 5- Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for(int i = 0; i<episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
