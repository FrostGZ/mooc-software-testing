package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class GHappyTest {
    @Test
    public void testGHappy() {
        GHappy ghappy = new GHappy();
        Assertions.assertTrue(ghappy.gHappy("xxggxx"));
        Assertions.assertTrue(ghappy.gHappy("gg"));
        Assertions.assertTrue(ghappy.gHappy("ggg"));
        Assertions.assertTrue(ghappy.gHappy(""));
        Assertions.assertTrue(ghappy.gHappy(null));

        Assertions.assertFalse(ghappy.gHappy("xxgxx"));
        Assertions.assertFalse(ghappy.gHappy("xxggyygxx"));
        Assertions.assertFalse(ghappy.gHappy("g"));
        Assertions.assertFalse(ghappy.gHappy("gxxg"));

    }
}
