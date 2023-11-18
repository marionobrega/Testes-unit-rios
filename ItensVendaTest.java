import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemVendaTest {

    @Test
    void testCalculaTotal() {
        ItemVenda item = new ItemVenda("Produto", 10.0, 2.0);
        assertEquals(20.0, item.calculaTotal());
    }

    @Test
    void testDescricaoNaoNula() {
        ItemVenda item = new ItemVenda(null, 10.0, 2.0);
        assertNotNull(item.getDescricao());
    }

    @Test
    void testQuantidadeMaiorQueZero() {
        ItemVenda item = new ItemVenda("Produto", 10.0, -2.0);
        assertTrue(item.getQuantidade() > 0);
    }
}
