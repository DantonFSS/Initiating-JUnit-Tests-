package one.digitalinnovation.Test3;

import one.digitalinnovation.Conta;
import one.digitalinnovation.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas tra = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                tra.trasnfere(contaOrigem, contaDestino, -1));
    }
}
