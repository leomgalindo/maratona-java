package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    // Vídeo 49 - Orientação Objetos - Métodos pt 06 - Parâmetros tipo referência
    public String nome;
    public int idade;
    public char sexo;

    // Vídeo 51 - Orientação Objetos - Métodos pt 08 - Referência this
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
