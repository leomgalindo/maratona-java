package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // Vídeo 87 - Orientação Objetos - Interfaces pt 01 - Introdução
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    // Vídeo 88 - Orientação Objetos - Interfaces pt 02 - Implementando múltiplas interfaces
    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
    // Vídeo 89 - Orientação Objetos - Interfaces pt 03 - Atributos e métodos estáticos
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na DatabaseLoader");
    }
}
