package academy.devdojo.maratonajava.introducao.aula06;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        System.out.println("Vídeio 28 - Estruturas de Repetição pt 02 - Exercício for");
        System.out.println(4 % 2);
        // Imprima todos os números pares de 0 até 1.000.000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
