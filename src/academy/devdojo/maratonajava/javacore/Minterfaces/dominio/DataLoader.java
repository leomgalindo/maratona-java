package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // Vídeo 87 - Orientação Objetos - Interfaces pt 01 - Introdução
    // Vídeo 89 - Orientação Objetos - Interfaces pt 03 - Atributos e métodos estáticos
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
