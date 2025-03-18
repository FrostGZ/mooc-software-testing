package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void complexNumber() {
        int result = roman.convert("MCMXCIV");
        Assertions.assertEquals(1994, result);
    }

    @Test
    public void largestRomanNumeral() {
        int result = roman.convert("MMMCMXCIX");
        Assertions.assertEquals(3999, result);
    }

    @Test
    public void invalidRomanNumeral() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> roman.convert("IIII"));
    }

    @Test
    public void emptyString() {
        int result = roman.convert("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void lowercaseInput() {
        int result = roman.convert("ix");
        Assertions.assertEquals(9, result);
    }

    @Test
    public void invalidSubtractiveNotation() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> roman.convert("IC"));
    }
}