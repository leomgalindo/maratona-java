package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args){
        System.out.println("Vídeo 71 - Orientação Objetos - Herança pt 01");
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-678");

        Pessoa pessoa = new Pessoa("Leo");
        pessoa.setCpf("12345678901");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Bia");
        funcionario.setCpf("11111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);

        System.out.println("\nVídeo 72 - Orientação Objetos - Herança pt 02 - Super");
        funcionario.imprime();

        System.out.println("\nVídeo 73 - Orientação Objetos - Herança pt 03 - protected");
        funcionario.relatorioPagamento();
    }
}
