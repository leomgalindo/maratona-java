package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagameto;

public class ClienteTest01 {
    public static void main(String[] args) {
        System.out.println("Vídeo 80 - Orientação Objetos - Enumeração pt 01 - Introdução");
        System.out.println("Vídeo 81 - Orientação Objetos - Enumeração pt 02 - Construtores e atributos");
        Cliente cliente1 = new Cliente("Leo", TipoCliente.PESSOA_FISICA, TipoPagameto.DEBITO);
        Cliente cliente2 = new Cliente("Bia", TipoCliente.PESSOA_JURIDICA, TipoPagameto.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("\nVídeo 82 - Orientação Objetos - Enumeração pt 03 - Sobrescrita de métodos");
        System.out.println(TipoPagameto.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagameto.CREDITO.calcularDesconto(100));

        System.out.println("\nVídeo 83 - Orientação Objetos - Enumeração pt 04 - Busca por atributos");
        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente1.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
