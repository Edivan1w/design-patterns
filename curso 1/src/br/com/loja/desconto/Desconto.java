package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calculardesconto(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calculardesconto(orcamento);
	}

	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	public abstract Boolean deveAplicar(Orcamento orcamento);
}
