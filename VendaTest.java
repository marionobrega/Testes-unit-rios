import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class VendaTest {

    @Test
    void testCalculaTotalComDesconto() {
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Produto1", 10.0, 2.0));
        itens.add(new ItemVenda("Produto2", 5.0, 3.0));

        Venda venda = new Venda("Cliente", itens, 0.0, 5.0);
        assertEquals(35.0, venda.calculaTotalComDesconto());
    }

    @Test
    void testClienteNaoNulo() {
        List<ItemVenda> itens = new ArrayList<>();
        Venda venda = new Venda(null, itens, 0.0, 0.0);
        assertNotNull(venda.getCliente());
    }

    @Test
    void testValorVendaNaoNegativo() {
        List<ItemVenda> itens = new ArrayList<>();
        Venda venda = new Venda("Cliente", itens, -10.0, 0.0);
        assertTrue(venda.getValorVenda() >= 0);
    }
}
