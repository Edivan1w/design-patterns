package br.com.loja.pedido;

import java.time.LocalDate;

import br.com.loja.orcamento.Orcamento;

public class Pedido {

	private String cliente;
	private LocalDate dataCriacao;
	private Orcamento orcamento;
	
	public Pedido(String cliente, LocalDate dataCriacao, Orcamento orcamento) {
		super();
		this.cliente = cliente;
		this.dataCriacao = dataCriacao;
		this.orcamento = orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}
	
	
}
