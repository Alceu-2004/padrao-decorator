package pagamento.app;

import pagamento.core.Pagamento;
import pagamento.core.PagamentoBase;
import pagamento.decorators.*;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamento = new PagamentoBase(100);

        pagamento = new DescontoDecorator(pagamento, 0.10);
        pagamento = new TaxaDecorator(pagamento, 5);
        pagamento = new CashbackDecorator(pagamento, 0.02);

        System.out.println("Descrição: " + pagamento.getDescricao());
        System.out.println("Valor final: " + pagamento.getValor());
    }
}