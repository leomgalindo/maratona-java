package academy.devdojo.maratonajava.introducao.aula03;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        System.out.println("Vídeo 14 - Tipos primitivos pt 05 - Exercício");
        String nome = "Leo";
        String endereco = "Rua XPTO";
        double salario = 1000.32;
        String dataRecebimentoSalario = "2023-02-20";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
