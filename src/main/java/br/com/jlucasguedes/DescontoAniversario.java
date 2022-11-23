package br.com.jlucasguedes;

public class DescontoAniversario implements IDesconto {
    private Venda venda;

    DescontoAniversario(Venda venda) {
        this.venda = venda;
    }

    @Override
    public double calcular() {
        return venda.getValorTotal() - (venda.getValorTotal() * 0.15);
    }
}
