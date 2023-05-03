package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 95 - Exceções pt 01 - Errors");
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
