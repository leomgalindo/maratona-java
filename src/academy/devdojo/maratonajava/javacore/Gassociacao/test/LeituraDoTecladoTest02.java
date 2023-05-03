package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        System.out.println("Vídeo 69 - Orientação Objetos - Exercício leitura de dados do teclado");
        Scanner entrada = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei com SIM ou NÃO");
        String pergunta = entrada.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
