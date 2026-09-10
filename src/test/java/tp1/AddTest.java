package tp1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {

    @Test
    public void testAddPositifs() {
        Add add = new Add();
        assertEquals(5, add.add(3, 2));
    }

    @Test
    public void testAddResultatNegatif() {
        Add add = new Add();
        assertEquals(-5, add.add(0, -5));
    }

    @Test
    public void testAddAvecZero() {
        Add add = new Add();
        assertEquals(4, add.add(4, 0));
    }
}
