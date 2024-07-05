package one.digitalinnovation;

public class TransferenciaEntreContas {

    public void trasnfere(Conta contaOrigem, Conta contaDestino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }
}
