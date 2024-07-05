package one.digitalinnovation.Test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Danton")
    void validarAlgoSomenteNoUsuarioDanton() {
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "Danton")
    void validarAlgoSomenteNoUserDanton() {
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @EnabledOnOs(OS.SOLARIS)
    void validarAlgoSomenteUserDanton() {
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @EnabledOnOs({OS.SOLARIS, OS.MAC})
    void validarAlgoSomenteUserDanto() {
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void validarAlgoSomenteUserDan() {
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_22)
    void validarAlgoSomenteUserD() {
        Assertions.assertEquals(10, 5 + 5);
    }
}

