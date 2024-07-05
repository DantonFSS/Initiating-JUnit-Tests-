package one.digitalinnovation.Test1;

import one.digitalinnovation.Test0.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoa {

    @BeforeAll
    static void configuraConexao() {
        DataBase.iniciarConexao();
    }
    @BeforeEach
    void inserirDados() {
        DataBase.inserirDados(new Pessoa("gay", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));

    }
    @Test
    void validarDadosRetornados() {
        Assertions.assertTrue(true);
    }
    @Test
    void validarDadosNulos() {
        Assertions.assertNull(null);
    }
    @AfterEach
    void removeDados() {
        DataBase.removeDados(new Pessoa("gay", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }
    @AfterAll
    static void finalizarConexao() {
        DataBase.finalizarConexao();
    }
}
