import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {

    @Test
    public void digitsDiferents() {
        int esperat=4;
        Any any= new Any(2015);
        assertEquals(esperat,any.digitsDiferents());
        Any any2 = new Any(2020);
        esperat=2;
        assertEquals(esperat,any2.digitsDiferents());
        Any any3 = new Any(2022);
        esperat=2;
        assertEquals(esperat,any3.digitsDiferents());
    }
}