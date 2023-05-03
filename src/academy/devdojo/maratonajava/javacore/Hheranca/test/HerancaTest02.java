package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        System.out.println("Vídeo 75 - Orientação Objetos - Herança pt 05 - Sequência de inicialização");
        // 1- Bloco de inicialização estático da superclasse é executado quando a JVM carregar a superclasse
        // 2- Bloco de inicialização estático da sub classe é executado quando a JVM carregar a subclasse
        // 3- Alocado espaço em memória para o objeto da superclasse
        // 4- Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado
        // 5- Bloco de inicialização da superclasse é executado na ordem que aparece
        // 6- Construtor é executado da superclasse
        // 7- Alocado espaço em memória para o objeto da subclasse
        // 8- Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
        // 9- Bloco de inicialização da subclasse é executado na ordem que aparece
        // 10- Construtor é executado da subclasse
        Funcionario funcionario = new Funcionario("Leo");
    }
}
