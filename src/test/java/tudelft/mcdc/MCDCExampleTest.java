package tudelft.mcdc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MCDCExampleTest {

    public boolean expression(boolean a, boolean b, boolean c) {
        return (a && b) || c;
    }

    @Test
    public void test2() {
        Assertions.assertTrue(expression(true, true, false));
    }

    @Test
    public void test3() {
        Assertions.assertTrue(expression(true, false, true));
    }

    @Test
    public void test4() {
        Assertions.assertFalse(expression(true, false, false));
    }

    @Test
    public void test6() {
        Assertions.assertTrue(expression(false, true, true));
    }
}