package pagamento.core;

public class PagamentoBase implements Pagamento {

    private double valor;

    public PagamentoBase(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Pagamento base";
    }
}