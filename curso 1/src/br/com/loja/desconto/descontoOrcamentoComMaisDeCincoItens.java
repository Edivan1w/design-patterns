package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class descontoOrcamentoComMaisDeCincoItens extends Desconto{
	
	
	public descontoOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getItens() > 5;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
}
