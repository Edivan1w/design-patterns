package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class descontoParaOrcamentoAcimaDeQuinhentosReais extends Desconto{

	
		public descontoParaOrcamentoAcimaDeQuinhentosReais(Desconto proximo) {
		super(proximo);
	}

		@Override
		public Boolean deveAplicar(Orcamento orcamento) {
			return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
		}

		@Override
		public BigDecimal efetuarCalculo(Orcamento orcamento) {
			return orcamento.getValor().multiply(new BigDecimal("0.06")); 
		}
}
