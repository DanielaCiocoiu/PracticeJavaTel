package AnBisect;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnBisectTest {

    @Test
    public void test() {
        AnBisect anBisect = new AnBisect();
        assertEquals(false, anBisect.anBisect(1900));
        assertEquals(false, anBisect.anBisect(-100));
        assertEquals(false, anBisect.anBisect(1000));
        assertEquals(true, anBisect.anBisect(20000));
        assertEquals(true, anBisect.anBisect(2020));
        assertEquals(false, anBisect.anBisect(2019));
        assertEquals(true, anBisect.anBisect(2000));
    }
}
