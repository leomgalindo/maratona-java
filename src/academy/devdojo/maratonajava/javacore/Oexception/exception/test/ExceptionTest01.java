package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 97 - Exceções pt 03 - Exception");
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
