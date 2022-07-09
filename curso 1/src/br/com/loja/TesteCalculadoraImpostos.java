package br.com.loja;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.desconto.CalculadoraDesconto;
import br.com.loja.impostos.CalculadoraImpostos;
import br.com.loja.impostos.ICMS;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.AcoesAposOPedido;
import br.com.loja.pedido.EnviarEmail;
import br.com.loja.pedido.GerarPedidoHandler;
import br.com.loja.pedido.Pedido;
import br.com.loja.pedido.SalvarPedidos;

public class TesteCalculadoraImpostos {

	public static void main(String[] args) {
		  
		CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
		ICMS icms = new ICMS();
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
		BigDecimal imposto = calculadoraImpostos.calcularImposto(orcamento, icms);
		
		orcamento.aprovar();
		//orcamento.reprovar();
		orcamento.finalizar();
		
		
		List<AcoesAposOPedido>acoes = new ArrayList<AcoesAposOPedido>();
		acoes.add(new SalvarPedidos());
		acoes.add(new EnviarEmail());
		GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(acoes);
		
		Pedido pedido = new Pedido("edivan", LocalDate.now(), orcamento);
		gerarPedidoHandler.executarAcao(pedido);
		
		//System.out.println(CalculadoraDesconto.calculardesconto(orcamento));
	}
	
}
