import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    @Test
    void esHyperpar() {
        boolean esperado=false;
        Hyperpar hyperpar = new Hyperpar(2450);
        assertEquals(esperado,hyperpar.esHyperpar());
        esperado=true;
        hyperpar = new Hyperpar(24860);
        assertEquals(esperado,hyperpar.esHyperpar());
    }
}