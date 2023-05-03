package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    // Vídeo 80 - Orientação Objetos - Enumeração pt 01 - Introdução
    // Vídeo 81 - Orientação Objetos - Enumeração pt 02 - Construtores e atributos

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagameto tipoPagameto;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagameto tipoPagameto) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagameto = tipoPagameto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagameto=" + tipoPagameto +
                '}';
    }
}
