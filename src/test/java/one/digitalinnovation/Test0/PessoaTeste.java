package one.digitalinnovation.Test0;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void calcularIdade() {
        Pessoa jessica = new Pessoa("aaaaaa", LocalDateTime.of(2001, 6,29, 0,0,0));
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    void seMaiorDeIdade() {
        Pessoa jessica = new Pessoa("aaaaaa", LocalDateTime.of(2001, 6,29, 17,42,0));
        Assertions.assertTrue(jessica.maiorDeIdade());

        Pessoa jao = new Pessoa("jao", LocalDateTime.now());
        Assertions.assertFalse(jao.maiorDeIdade());
    }
}
