package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    // Vídeo 44 - Orientação Objetos - Métodos pt 01
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    // Vídeo 45 - Orientação Objetos - Métodos pt 02 - Parâmetros
    public void multiplicaDoisnumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    // Vídeo 46 - Orientação Objetos - Métodos pt 03 - Retorno pt 01
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // Vídeo 48 - Orientação Objetos - Métodos pt 05 - Parâmetros tipo primitivo
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    // Vídeo 52 - Orientação Objetos - Métodos pt 09 - Varargs
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
