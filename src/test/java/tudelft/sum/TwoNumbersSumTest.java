package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    @Test
    public void sumaSinAcarreo() {
        TwoNumbersSum sumador = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(4, 5));
        assertEquals(Arrays.asList(6, 8), sumador.addTwoNumbers(a, b));
    }

    @Test
    public void sumaConAcarreoSimple() {
        TwoNumbersSum sumador = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(7, 8));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(5, 3));
        assertEquals(Arrays.asList(1, 3, 1), sumador.addTwoNumbers(a, b));
    }

    @Test
    public void sumaConListaMasCorta() {
        TwoNumbersSum sumador = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1));
        assertEquals(Arrays.asList(1, 0, 0), sumador.addTwoNumbers(a, b));
    }

    @Test
    public void sumaDeUnSoloDigito() {
        TwoNumbersSum sumador = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(5));
        assertEquals(Arrays.asList(9), sumador.addTwoNumbers(a, b));
    }

    @Test
    public void sumaConCero() {
        TwoNumbersSum sumador = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(Arrays.asList(1, 2, 3), sumador.addTwoNumbers(a, b));
    }
}