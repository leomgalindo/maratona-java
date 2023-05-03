package academy.devdojo.maratonajava.introducao.aula06;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        System.out.println("Vídeo 29 - Estruturas de Repetição pt 03 - Break");
        // Imprima os primeiros 25 números de um dado valor
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
