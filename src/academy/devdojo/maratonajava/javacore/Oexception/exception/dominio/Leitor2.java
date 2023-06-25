package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    //Vídeo 103 - Exceções pt 09 - Try with resources
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2");
    }
}
