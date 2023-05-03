package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    // Vídeo 80 - Orientação Objetos - Enumeração pt 01 - Introdução
    // Vídeo 81 - Orientação Objetos - Enumeração pt 02 - Construtores e atributos
    // Vídeo 83 - Orientação Objetos - Enumeração pt 04 - Busca por atributos
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
