package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args){
        System.out.println("Vídeo 84 - Orientação Objetos - Classes abstratas pt 01");
        System.out.println("Vídeo 85 - Orientação Objetos - Classes abstratas pt 02 - Métodos abstratos");
        Gerente gerente = new Gerente("Bia", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Leo", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        System.out.println("\nVídeo 86 - Orientação Objetos - Classes abstratas pt 03 - Métodos abstratos regras");

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
