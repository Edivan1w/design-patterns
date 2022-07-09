package br.com.loja.pedido;

public class EnviarEmail implements AcoesAposOPedido {

	
	public Boolean executar(Pedido pedido) {
		System.out.println("Enviar e-mail com dados do pedido");
		return true;
	}
}