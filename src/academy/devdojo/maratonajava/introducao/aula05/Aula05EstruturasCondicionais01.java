package academy.devdojo.maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 20 - Estruturas Condicionais pt 01 - IF");
        System.out.println("Vídeo 21 - Estruturas Condicionais pt 02 - ELSE IF");
        int idade = 15;
        boolean isAutorizadoCompraBebida = idade >= 18;
        if(isAutorizadoCompraBebida){
            System.out.println("Autorizado a comprar bebida alcoólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
        // ! (se não)
        if(!isAutorizadoCompraBebida){ //isAutorizadoCompraBebida == false
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        System.out.println("Fora do if");
    }
}
