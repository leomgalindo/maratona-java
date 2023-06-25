package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    //Vídeo 104 - Exceções pt 10 - Exceção customizada
    public LoginInvalidoException() {
        System.out.println("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
