package pagamento;

import org.junit.jupiter.api.Test;
import pagamento.core.Pagamento;
import pagamento.core.PagamentoBase;
import pagamento.decorators.*;

import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    void deveRetornarValorBase() {
        Pagamento pagamento = new PagamentoBase(100);
        assertEquals(100, pagamento.getValor());
    }

    @Test
    void deveAplicarDesconto() {
        Pagamento pagamento = new DescontoDecorator(new PagamentoBase(100), 0.10);
        assertEquals(90, pagamento.getValor());
    }

    @Test
    void deveAplicarTaxa() {
        Pagamento pagamento = new TaxaDecorator(new PagamentoBase(100), 10);
        assertEquals(110, pagamento.getValor());
    }

    @Test
    void deveAplicarCashback() {
        Pagamento pagamento = new CashbackDecorator(new PagamentoBase(100), 0.10);
        assertEquals(90, pagamento.getValor());
    }

    @Test
    void deveCombinarDecorators() {
        Pagamento pagamento = new PagamentoBase(100);
        pagamento = new DescontoDecorator(pagamento, 0.10); // 90
        pagamento = new TaxaDecorator(pagamento, 10);       // 100
        pagamento = new CashbackDecorator(pagamento, 0.10); // 90

        assertEquals(90, pagamento.getValor());
    }
}