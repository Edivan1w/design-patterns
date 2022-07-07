package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDesconto {

	public static BigDecimal calculardesconto(Orcamento orcamento) {
		Desconto desconto = new descontoOrcamentoComMaisDeCincoItens(
				new descontoParaOrcamentoAcimaDeQuinhentosReais(
						new SemDesconto()));
				return desconto.calculardesconto(orcamento);
	}
}