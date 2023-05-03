package academy.devdojo.maratonajava.introducao.aula06;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        System.out.println("Vídeo 30 - Estruturas de Repetição pt 04 - Exercício Break");
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
