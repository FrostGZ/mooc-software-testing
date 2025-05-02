package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    public void aplicaDescuentoParaHome() {
        Product p1 = new Product("Silla", 100.0, "HOME");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(p1));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, p1.getPrice(), 0.0001);
    }

    @Test
    public void aplicaAumentoParaBusiness() {
        Product p1 = new Product("Servidor", 200.0, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(p1));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(220.0, p1.getPrice(), 0.0001);
    }

    @Test
    public void ignoraOtrasCategorias() {
        Product p1 = new Product("Café", 50.0, "OTROS");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(p1));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(50.0, p1.getPrice(), 0.0001);
    }
}
