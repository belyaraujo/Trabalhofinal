package br.com.prog2.chale.persistencia;

import java.util.List;

import br.com.prog2.chale.model.Hospedagem;

public interface HospedagemDAO {
    public String inserir(Hospedagem hosp);

    public String alterar(Hospedagem hosp);

    public String excluir(Hospedagem hosp);

    public List<Hospedagem> listarTodos();
}
