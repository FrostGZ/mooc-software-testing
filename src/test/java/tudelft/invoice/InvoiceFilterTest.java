package tudelft.invoice;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tudelft.invoicemocked.Invoice;
import tudelft.invoicemocked.InvoiceDao;
import tudelft.invoicemocked.InvoiceFilter;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceFilterTest {

    @Test
    public void filterInvoices() {
        Invoice i1 = new Invoice("Cliente1", 80.0);
        Invoice i2 = new Invoice("Cliente2", 200.0);

        InvoiceDao dao = Mockito.mock(InvoiceDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(i1, i2));

        InvoiceFilter filter = new InvoiceFilter(dao);
        List<Invoice> result = filter.filter();

        assertEquals(1, result.size());
        assertEquals(i1, result.get(0));
    }
}
