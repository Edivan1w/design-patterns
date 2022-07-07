package br.com.loja.impostos;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class ICMS implements Impostos{

	@Override
	public BigDecimal calcular() {
		return new BigDecimal("0.1");
	}
	
}
