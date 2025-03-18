package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumFinderTest {

    @Test
    public void testFindWithMixedNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{4, 25, 7, 9});

        Assertions.assertEquals(25, nf.getLargest());
        Assertions.assertEquals(4, nf.getSmallest());
    }

    @Test
    public void testFindWithDescendingNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{4, 3, 2, 1});

        Assertions.assertEquals(4, nf.getLargest());
        Assertions.assertEquals(1, nf.getSmallest());
    }

    @Test
    public void testFindWithAscendingNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{1, 2, 3, 4});

        Assertions.assertEquals(4, nf.getLargest());
        Assertions.assertEquals(1, nf.getSmallest());
    }

    @Test
    public void testFindWithSameNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{9, 9, 9, 9});

        Assertions.assertEquals(9, nf.getLargest());
        Assertions.assertEquals(9, nf.getSmallest());
    }

    @Test
    public void testFindWithNegativeNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{-10, -18, -29, -3});

        Assertions.assertEquals(-3, nf.getLargest());
        Assertions.assertEquals(-29, nf.getSmallest());
    }

    @Test
    public void testFindWithSingleElement() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{81});

        Assertions.assertEquals(81, nf.getLargest());
        Assertions.assertEquals(81, nf.getSmallest());
    }

    @Test
    public void testFindWithEmptyArray() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{});

        Assertions.assertEquals(Integer.MIN_VALUE, nf.getLargest());
        Assertions.assertEquals(Integer.MAX_VALUE, nf.getSmallest());
    }

    @Test
    public void testFindWithMixedPositiveAndNegativeNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{-71, 0, 3, -7, 11});

        Assertions.assertEquals(11, nf.getLargest());
        Assertions.assertEquals(-71, nf.getSmallest());
    }

    @Test
    public void testFindWithIntegerLimits() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0});

        Assertions.assertEquals(Integer.MAX_VALUE, nf.getLargest());
        Assertions.assertEquals(Integer.MIN_VALUE, nf.getSmallest());
    }
}