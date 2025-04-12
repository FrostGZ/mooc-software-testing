
package tudelft.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculadoraTest {

    @Test
    void testSumar() {
        calculadora calc = new calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(-1, calc.sumar(2, -3));
        assertEquals(0, calc.sumar(0, 0));
        assertEquals(-3, calc.sumar(-2, -1));
    }

    @Test
    void testEvaluarNumeroPositivo() {
        calculadora calc = new calculadora();
        assertEquals("Positivo", calc.evaluarNumero(5));
    }

    @Test
    void testEvaluarNumeroNegativo() {
        calculadora calc = new calculadora();
        assertEquals("Negativo", calc.evaluarNumero(-5));
    }

    @Test
    void testEvaluarNumeroCero() {
        calculadora calc = new calculadora();
        assertEquals("Cero", calc.evaluarNumero(0));
    }

    @Test
    void testEsParVerdadero() {
        calculadora calc = new calculadora();
        assertTrue(calc.esPar(4));
        assertTrue(calc.esPar(0));
        assertTrue(calc.esPar(-2));
    }

    @Test
    void testEsParFalso() {
        calculadora calc = new calculadora();
        assertFalse(calc.esPar(3));
        assertFalse(calc.esPar(-1));
    }
}