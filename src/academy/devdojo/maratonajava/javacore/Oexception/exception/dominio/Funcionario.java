package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    //Vídeo 105 - Exceções pt 11 - Exceção e regras de sobrescrita
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Funcionário");
    }
}
