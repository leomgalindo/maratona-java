package academy.devdojo.maratonajava.introducao.aula08;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        System.out.println("Vídeo 38 - Arrays Multidimensionais pt 03 - Inicialização");
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, array, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt2) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }
    }
}
