package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDesconto;
import br.com.loja.impostos.CalculadoraImpostos;
import br.com.loja.impostos.ICMS;
import br.com.loja.orcamento.Orcamento;

public class TesteCalculadoraImpostos {

	public static void main(String[] args) {
		  
		CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
		ICMS icms = new ICMS();
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
		BigDecimal imposto = calculadoraImpostos.calcularImposto(orcamento, icms);
		
		orcamento.aprovar();
		orcamento.reprovar();
		orcamento.finalizar();
		System.out.println(orcamento.aplicarDescontoExtra());
		
		
		//System.out.println(CalculadoraDesconto.calculardesconto(orcamento));
	}
	
}
