import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.GerarPedido;
import br.com.loja.pedido.GerarPedidoHandler;
import br.com.loja.pedido.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		Integer quantidadeItens =   Integer.parseInt(args[2]);
		
		
		GerarPedido gerarPedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
		//GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler();
		//gerarPedidoHandler.executa(gerarPedido);
	}
}
