package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 61 - Orientação Objetos - Modificador static");
        System.out.println("Vídeo 62 - Orientação Objetos - Métodos estáticos");

        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);



        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}