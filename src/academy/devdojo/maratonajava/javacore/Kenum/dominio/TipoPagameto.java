package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagameto {
    // Vídeo 82 - Orientação Objetos - Enumeração pt 03 - Sobrescrita de métodos
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}