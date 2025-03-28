package tudelft.chocolate;

public class ChocolateBags {
// Verificado: La condición "small < total" es correcta.
// No existe error en esta lógica; todas las pruebas se ejecutan correctamente.
    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxesWeCanUse * 5);

        if(small < total)
            return -1;
        return total;
    }
}
