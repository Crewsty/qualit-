package tp1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class subTest {

    
    public void testSubPositifs() {
        sub sub = new sub();
        assertEquals(1, sub.Sub(3, 2));
    }

    
    public void testSubResultatNegatif() {
        sub sub = new sub();
        assertEquals(-5, sub.Sub(0, 5));
    }

    @Test
    public void testSubAvecZero() {
        sub sub = new sub();
        assertEquals(4, sub.Sub(4, 0));
    }
}