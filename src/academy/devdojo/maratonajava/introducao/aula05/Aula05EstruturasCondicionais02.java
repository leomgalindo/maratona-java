package academy.devdojo.maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        System.out.println("Vídeo 21 - Estruturas Condicionais pt 02 - ELSE IF");
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 17;
        String categoria;
        
        if(idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
