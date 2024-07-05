package one.digitalinnovation.Test4;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoOrdemTest {

    @Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
@TestMethodOrder(MethodOrderer.MethodName.class)
class EscolhendoOrdem2 {

    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
@TestMethodOrder(MethodOrderer.DisplayName.class)
class EscolhendoOrdem3 {

    @DisplayName("test 1")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }
    @DisplayName("test 2.0")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }
    @DisplayName("test 2.1")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }
    @DisplayName("test 1.4")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
