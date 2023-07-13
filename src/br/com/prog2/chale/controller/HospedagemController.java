package br.com.prog2.chale.controller;

import java.util.List;

import br.com.prog2.chale.model.Hospedagem;
import br.com.prog2.chale.persistencia.HospedagemDAOImp;

public class HospedagemController {
    public String inserir(Hospedagem hosp) {
        HospedagemDAOImp dao = new HospedagemDAOImp();
        return dao.inserir(hos);
    }

    public String alterar(Hospedagem hosp) {
        HospedagemDAOImp dao = new HospedagemDAOImp();
        return dao.alterar(hos);
    }

    public String excluir(Hospedagem hosp) {
        HospedagemDAOImp dao = new HospedagemDAOImp();
        return dao.excluir(hos);
    }

    public List<Cliente> listarTodos() {
        HospedagemDAOImp dao = new HospedagemDAOImp();
        return dao.listarTodos();
    }
}
