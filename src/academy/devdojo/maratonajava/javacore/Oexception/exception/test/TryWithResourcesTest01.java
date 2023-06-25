package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 103 - Exceções pt 09 - Try with resources");
        lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e){

        }
    }
}
