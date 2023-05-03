package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioTest {
    public static void main(String[] args) {
        System.out.println("Vídeo 94 - Orientação Objetos - Polimorfismo pt 05 - Programação orientada a interface");
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
