package academy.devdojo.maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        System.out.println("Vídeo 22 - Estruturas Condicionais pt 03 - Operador ternário");
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
