package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    // Vídeo 87 - Orientação Objetos - Interfaces pt 01 - Introdução
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    // Vídeo 88 - Orientação Objetos - Interfaces pt 02 - Implementando múltiplas interfaces
    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }
}
