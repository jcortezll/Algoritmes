import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {

    @Test
    public void digitsDiferents() {
        int esperat=4;
        Any any= new Any(2015);
        assertEquals(esperat,any.digitsDiferents());
    }
}