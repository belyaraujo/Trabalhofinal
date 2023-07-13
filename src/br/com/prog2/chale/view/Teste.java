package br.com.prog2.chale.view;

import br.com.prog2.chale.model.Cliente;

import java.sql.Connection;
import br.com.prog2.chale.persistencia.ConnectionFactory;

public class Teste {
	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
		if (con != null) {
			System.out.println("OK");
			ConnectionFactory.close(con);
			Cliente cli = new Cliente();
			ClienteController controller = new ClienteController();
			cli.setnomeCliente("Maria da Silva");
			cli.setrgCliente("12345678");
			cli.setenderecoCliente('Rua das margaridas');
			cli.setbairroCliente('Vicente pires');
			cli.setcidadeCliente('Brasília');
			cli.setestadoCliente('DF');
			cli.setCEPCliente(71002321);
			cli.setnascimentoCliente(12/07/1990);
			System.out.println(controller.inserir(cli));
		}
	}
}
