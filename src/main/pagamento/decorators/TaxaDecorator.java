package pagamento.decorators;

import pagamento.core.Pagamento;

public class TaxaDecorator extends PagamentoDecorator {

    private double taxa;

    public TaxaDecorator(Pagamento pagamento, double taxa) {
        super(pagamento);
        this.taxa = taxa;
    }

    @Override
    public double getValor() {
        return pagamento.getValor() + taxa;
    }

    @Override
    public String getDescricao() {
        return pagamento.getDescricao() + " + taxa";
    }
}