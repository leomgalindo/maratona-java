package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        System.out.println("Vídeo 67 - Orientação Objetos - Associação pt 04 - Associação bidirecional");
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
//        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
