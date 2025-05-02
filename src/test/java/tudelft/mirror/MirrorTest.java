package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {

    @Test
    public void testTextoSimetricoCompleto() {
        Mirror mirror = new Mirror();
        assertEquals("racecar", mirror.mirrorEnds("racecar"));
    }

    @Test
    public void testInicioIgualFinal() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    public void testMitadSimetrica() {
        Mirror mirror = new Mirror();
        assertEquals("abccba", mirror.mirrorEnds("abccba"));
    }

    @Test
    public void testSinCoincidencia() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("abcdef"));
    }

    @Test
    public void testUnCaracter() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("a"));
    }

    @Test
    public void testCadenaVacia() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds(""));
    }
}
