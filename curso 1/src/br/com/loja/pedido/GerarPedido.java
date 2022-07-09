package br.com.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.loja.orcamento.Orcamento;

public class GerarPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private Integer quantidadeItens;

	public GerarPedido(String cliente, BigDecimal valorOrcamento, Integer quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}



	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(BigDecimal valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

}
