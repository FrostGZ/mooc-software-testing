package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void testCaesarShiftCipher() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();

        Assertions.assertEquals("def", cipher.CaesarShiftCipher("abc", 3));
        Assertions.assertEquals("abc", cipher.CaesarShiftCipher("xyz", 3));
        Assertions.assertEquals("abc bcd", cipher.CaesarShiftCipher("zab abc", 1));
        Assertions.assertEquals("vlpsoh", cipher.CaesarShiftCipher("simple", 3));
        Assertions.assertEquals("mjqqt", cipher.CaesarShiftCipher("hello", 5));

        Assertions.assertEquals("xyz", cipher.CaesarShiftCipher("abc", -3));
        Assertions.assertEquals("zab", cipher.CaesarShiftCipher("abc", -1));

        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("abc123", 3));
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("abc$", 3));
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("abC", 3));
        Assertions.assertEquals(" ", cipher.CaesarShiftCipher(" ", 3));
    }
}