package one.digitalinnovation;

public class App {
    public static void main( String[] args ) {

    }
    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }
}
