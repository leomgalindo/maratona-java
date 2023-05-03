package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

import javax.xml.crypto.Data;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 87 - Orientação Objetos - Interfaces pt 01 - Introdução");
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        System.out.println("\nVídeo 88 - Orientação Objetos - Interfaces pt 02 - Implementando múltiplas interfaces");
        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        System.out.println("\nVídeo 89 - Orientação Objetos - Interfaces pt 03 - Atributos e métodos estáticos");
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
