package br.com.jlucasguedes;

public class DescontoBancoDados implements IDesconto{

    private Venda venda;

    public DescontoBancoDados(Venda venda) {
        this.venda = venda;
    }

    @Override
    public double calcular() {
        return venda.getValorTotal() - (venda.getValorTotal() * 0.10);
    }
}
