package academy.devdojo.maratonajava.introducao.aula08;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 36 - Arrays Multidimensionais pt 01");
        // 1,2,3,4,5 meses
        // 31,28,31,30 dias
        int[][] dias = new int[3][3];
        dias[0][0]=31;
        dias[0][1]=28;
        dias[0][2]=31;

        dias[1][0]=30;
        dias[1][1]=31;
        dias[1][2]=30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("\nVídeo 37 - Arrays Multidimensionais pt 02 - Foreach");
        for (int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
