package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.IOException;

public class Pessoa {
    //Vídeo 105 - Exceções pt 11 - Exceção e regras de sobrescrita
    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("Salvando pessoa");
    }
}
