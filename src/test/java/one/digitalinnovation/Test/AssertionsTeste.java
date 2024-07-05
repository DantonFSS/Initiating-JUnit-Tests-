package one.digitalinnovation.Test;

import one.digitalinnovation.Test0.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    void validarLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa pessoa = null;

        pessoa = new Pessoa("ovo", LocalDateTime.now());

        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarTiposDeNumerosDiferentes() {

        double valor = 5.0;
        double valor1 = 5.0;

        Assertions.assertEquals(valor, valor1);
    }
}
