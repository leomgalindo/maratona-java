package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 77 - Orientação Objetos - Modificador final pt 01 - Tipo primitivo");
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println("\nVídeo 78 - Orientação Objetos - Modificador final pt 02 - Tipo referência");
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Leo");
        System.out.println(carro.COMPRADOR);

        System.out.println("\nVídeo 79 - Orientação Objetos - Modificador final pt 03 - Classes e métodos");
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
