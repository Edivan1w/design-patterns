package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private Integer itens;
	private SituacaoOrcamento situacao = new EmAnalise();
	
	public Orcamento() {
		//this.situacao = new EmAnalise();
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public Orcamento(BigDecimal valor, Integer itens) {
		this.valor = valor;
		this.itens = itens;
	}
	
	public BigDecimal aplicarDescontoExtra() {
	       BigDecimal descontoExtra  = this.situacao.calcularValorDoDescontoExtra(this);	
	       this.valor = this.valor.subtract(descontoExtra);
	       return this.valor;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public Integer getItens() {
		return itens;
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
}
