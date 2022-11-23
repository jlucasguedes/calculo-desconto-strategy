package br.com.jlucasguedes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Venda venda = new Venda(1l, LocalDate.now(), 1000.0, cliente);
        IDesconto desconto = new DescontoProgressivo(venda);
        venda.setValorTotal(desconto.calcular());

        System.out.println("Valor total com desconto: " + venda.getValorTotal());
    }
}