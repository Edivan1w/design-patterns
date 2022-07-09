package br.com.loja.pedido;

public class SalvarPedidos implements AcoesAposOPedido {

	public Boolean executar(Pedido pedido) {
		System.out.println("Salvar pedido no banco de dados");
		return false;
	}
}
