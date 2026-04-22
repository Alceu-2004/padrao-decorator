package pagamento.decorators;

import pagamento.core.Pagamento;

public class CashbackDecorator extends PagamentoDecorator {

    private double percentual;

    public CashbackDecorator(Pagamento pagamento, double percentual) {
        super(pagamento);
        this.percentual = percentual;
    }

    @Override
    public double getValor() {
        return pagamento.getValor() * (1 - percentual);
    }

    @Override
    public String getDescricao() {
        return pagamento.getDescricao() + " + cashback";
    }
}