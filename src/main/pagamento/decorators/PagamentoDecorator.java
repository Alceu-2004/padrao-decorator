package pagamento.decorators;

import pagamento.core.Pagamento;

public abstract class PagamentoDecorator implements Pagamento {

    protected Pagamento pagamento;

    public PagamentoDecorator(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public double getValor() {
        return pagamento.getValor();
    }

    @Override
    public String getDescricao() {
        return pagamento.getDescricao();
    }
}