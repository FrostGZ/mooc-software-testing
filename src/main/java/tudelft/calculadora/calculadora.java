package tudelft.calculadora;

// Cobertura de sentencia > Verifica cada línea de codigo
// Cobertura de decisiones > Verifica que cada decision sea llamada en el test
// Cobertura de condiciones > Prueba todas las combinaciones posibles
// Cobertura de caminos > Prueba todas las rutas logicas
public class calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    public String evaluarNumero(int numero) {
        if (numero > 0) {
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Cero";
        }
    }
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
// Generen los tests para que cumplan las condiciones del Testing Estructural
