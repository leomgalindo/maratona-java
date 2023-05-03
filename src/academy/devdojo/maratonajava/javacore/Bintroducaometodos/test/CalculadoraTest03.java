package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        System.out.println("Vídeo 46 - Orientação Objetos - Métodos pt 03 - Retorno pt 01");
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
