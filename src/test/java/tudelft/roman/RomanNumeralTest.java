package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void complexNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MCMXCIV");
        Assertions.assertEquals(1994, result);
    }

    @Test
    public void largestRomanNumeral() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MMMCMXCIX");
        Assertions.assertEquals(3999, result);
    }

    @Test
    public void invalidRomanNumeral() {
        RomanNumeral roman = new RomanNumeral();
        Assertions.assertThrows(IllegalArgumentException.class, () -> roman.convert("IIII"));
    }

    @Test
    public void emptyString() {
        RomanNumeral roman = new RomanNumeral();
        Assertions.assertEquals(0, roman.convert(""));
    }

    @Test
    public void lowercaseInput() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("ix");
        Assertions.assertEquals(9, result);
    }

    @Test
    public void invalidSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        Assertions.assertThrows(IllegalArgumentException.class, () -> roman.convert("IC"));
    }
}