package tudelft.mcdc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MCDCExampleTest {

    public boolean logic(boolean A, boolean B, boolean C) {
        return (A && B) || C;
    }

    @Test
    public void test_2_TTF() {
        Assertions.assertTrue(logic(true, true, false));
    }

    @Test
    public void test_3_TFT() {
        Assertions.assertTrue(logic(true, false, true));
    }

    @Test
    public void test_4_TFF() {
        Assertions.assertFalse(logic(true, false, false));
    }

    @Test
    public void test_6_FTF() {
        Assertions.assertFalse(logic(false, true, false));
    }
}