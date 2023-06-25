package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SobrescritaComExceptioTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 105 - Exceções pt 11 - Exceção e regras de sobrescrita");
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | IOException e) {
            throw new RuntimeException(e);
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
