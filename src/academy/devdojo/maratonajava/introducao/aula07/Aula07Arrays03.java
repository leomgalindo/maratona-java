package academy.devdojo.maratonajava.introducao.aula07;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        System.out.println("Vídeo 35 - Arrays pt 04 - Foreach");
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};
        String[] letras = new String[]{"a", "b", "c"};

        for (int num : numeros3) {
            System.out.println(num);
        }

        System.out.println("\n");

        for (String letra : letras) {
            System.out.println(letra);
        }
    }
}
