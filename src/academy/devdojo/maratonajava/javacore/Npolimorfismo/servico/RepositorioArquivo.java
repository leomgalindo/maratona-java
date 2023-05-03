package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    // Vídeo 94 - Orientação Objetos - Polimorfismo pt 05 - Programação orientada a interface

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
