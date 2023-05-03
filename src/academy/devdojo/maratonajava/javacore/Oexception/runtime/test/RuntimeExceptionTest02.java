package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println("Vídeo 98 - Exceções pt 04 - Lançando exceção unchecked");
        divisao(1,0);
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return a/b
     * @throws IllegalArgumentException caso b seja zero
     */
    public static int divisao(int a, int b){
        if(b ==0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a/b;
    }
}
