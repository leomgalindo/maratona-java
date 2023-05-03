package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args){
        System.out.println("Vídeo 54 - Orientação Objetos - Modificador de acesso private, get e set pt 01");
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
