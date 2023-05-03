package academy.devdojo.maratonajava.introducao.aula04;

public class Aula04Operadores {
    public static void main(String[] args) {
        System.out.println("Vídeo 15 - Operadores pt 01 - Aritiméticos");
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        System.out.println("\nVídeo 16 - Operadores pt 02 - Relacionais");

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        System.out.println("\nVídeo 17 - Operadores pt 03 - Lógicos AND");
        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        System.out.println("\nVídeo 18 - Operadores pt 04 - Lógicos OR");
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPS5 = 5000F;

        boolean isPS5Compravel = valorTotalContaCorrente >= valorPS5 || valorTotalContaPoupanca >= valorPS5;
        System.out.println("isPS5Compravel " + isPS5Compravel);

        System.out.println("\nVídeo 19 - Operadores pt 05 - Atribuição");
        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        System.out.println("bonus é " + bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);
        // colocar depois ele vai executar uma ação antes e depois acrescentar ou reduzir
        int contador2 = 0;
        System.out.println(contador2++); // vai imprimir 0
        System.out.println(contador2); // vai imprimir 1
        // colocar antes ele vai acrescentar ou reduzir e depois executar a ação
        int contador3 = 0;
        System.out.println(++contador3); // vai imprimir 1
    }
}
