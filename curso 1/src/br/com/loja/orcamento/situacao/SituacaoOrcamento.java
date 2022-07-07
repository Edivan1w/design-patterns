package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.DomainException;
import br.com.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDoDescontoExtra(Orcamento orcamento) {
		 return BigDecimal.ZERO;
		}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("O orçamento já se encontra aprovado");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("O orçamento já se encontra reprovado");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("O orçamento já se encontra finalizado");
	}
}
