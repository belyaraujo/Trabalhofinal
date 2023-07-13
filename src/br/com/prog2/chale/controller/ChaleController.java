package br.com.prog2.chale.controller;

import java.util.List;

import br.com.prog2.chale.model.Chale;
import br.com.prog2.chale.persistencia.ChaleDAOImp;

public class ChaleController {
    public String inserir(Chale cha) {
        ChaleDAOImp dao = new ChaleDAOImp();
        return dao.inserir(cha);
    }

    public String alterar(Chale cha) {
        ChaleDAOImp dao = new ChaleDAOImp();
        return dao.alterar(cha);
    }

    public String excluir(ChaleDAOImp cha) {
        ChaleDAOImp dao = new ChaleDAOImp();
        return dao.excluir(cha);
    }

    public List<Chale> listarTodos() {
        ChaleDAOImp dao = new ChaleDAOImp();
        return dao.listarTodos();
    }

   
}
