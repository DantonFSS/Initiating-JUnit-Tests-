package one.digitalinnovation.Test1;

import one.digitalinnovation.Test0.Pessoa;

import java.util.logging.Logger;

public class DataBase {

    private static final Logger LOGGER = Logger.getLogger(DataBase.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexao");
    }
    public static void finalizarConexao() {
        LOGGER.info("finalizou conexao");
    }
    public static void inserirDados(Pessoa pessoa) {
        LOGGER.info("inseriu dados");
    }
    public static void removeDados(Pessoa pessoa) {
        LOGGER.info("removeu dados");
    }
}
