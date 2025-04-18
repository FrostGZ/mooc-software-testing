package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void endsWithR() {
        int words = new CountLetters().count("bear|lion");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void endsWithX() {
        int words = new CountLetters().count("linux");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void invalidSymbolBreak() {
        int words = new CountLetters().count("dog!");
        Assertions.assertEquals(0, words);
    }

}