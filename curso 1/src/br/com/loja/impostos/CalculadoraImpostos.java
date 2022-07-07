package br.com.loja.impostos;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraImpostos {
	
	public BigDecimal calcularImposto(Orcamento orcamento, Impostos imposto) {
		return orcamento.getValor().multiply(imposto.calcular());
		}
	}

