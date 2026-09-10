package tp1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubTest {

    @Test
    public void testSubPositifs() {
        Sub sub = new Sub();
        assertEquals(1, sub.sub(3, 2));
    }

    @Test
    public void testSubResultatNegatif() {
        Sub sub = new Sub();
        assertEquals(-5, sub.sub(0, 5));
    }

    @Test
    public void testSubAvecZero() {
        Sub sub = new Sub();
        assertEquals(4, sub.sub(4, 0));
    }
}