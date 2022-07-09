package br.com.loja.pedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import br.com.loja.orcamento.Orcamento;

public class GerarPedidoHandler {

	private List<AcoesAposOPedido> acoes;
	
	public GerarPedidoHandler(List<AcoesAposOPedido> acoes) {
		this.acoes = acoes;
	}

	public void executa(GerarPedido gerarPedido) {
		Orcamento orcamento = new Orcamento(gerarPedido.getValorOrcamento(), gerarPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(gerarPedido.getCliente(), LocalDate.now(), orcamento);
	}

	public void executarAcao(Pedido pedido) {
        //acoes.forEach(a -> a.executar(pedido));
     for (AcoesAposOPedido acoesAposOPedido : acoes) {
		if(acoesAposOPedido.executar(pedido).equals(true)) {
			acoesAposOPedido.executar(pedido);
		}
	}
       
	}

}
