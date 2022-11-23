package br.com.jlucasguedes;

public class DescontoProgressivo implements IDesconto{

    private Venda venda;

    public DescontoProgressivo (Venda venda) {
        this.venda = venda;
    }
    @Override
    public double calcular() {
        if(calcularDescontoProgressivo() > calcularLimiteVintPorcento() ) {
            return venda.getValorTotal() - calcularLimiteVintPorcento();
        } else {
            return venda.getValorTotal() - calcularDescontoProgressivo();
        }
    }

    private double calcularLimiteVintPorcento() {
       return venda.getValorTotal() * 0.20;

    }

    private double calcularDescontoProgressivo() {
        return (venda.getValorTotal() / 25) / 100;
    }
}
