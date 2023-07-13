package br.com.prog2.chale.controller;

import java.util.List;
import br.com.prog2.chale.model.Cliente;
import br.com.prog2.chale.persistencia.ClienteDAOImp;

public class ClienteController {
	public String inserir(Cliente emp) {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.inserir(emp);
	}

	public String alterar(Cliente emp) {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.alterar(emp);
	}

	public String excluir(Cliente emp) {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.excluir(emp);
	}

	public List<Cliente> listarTodos() {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.listarTodos();
	}

	public Cliente pesquisarPorCpf(String cpf) {
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.pesquisarPorCpf(cpf);
	}
}
