package br.com.prog2.chale.persistencia;

import br.com.prog2.chale.model.Hospedagem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HospedagemDAOImp implements HospedagemDAO {

    @Override
    public String inserir(Hospedagem hosp) {
        String sql = "INSERT INTO hospedagem (id, estado, data_inicio, data_fim, qtd_pessoas, desconto, valor_final) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, hosp.getId());
            pst.setString(2, hosp.getEstado());
            pst.setDate(3, new java.sql.Date(hosp.getDataInicio().getTime()));
            pst.setDate(4, new java.sql.Date(hosp.getDataFim().getTime()));
            pst.setInt(5, hosp.getQtdPessoas());
            pst.setFloat(6, hosp.getDesconto());
            pst.setFloat(7, hosp.getValorFinal());

            int res = pst.executeUpdate();
            if (res > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    @Override
    public String alterar(Hospedagem hosp) {
        String sql = "UPDATE hospedagem SET estado = ?, data_inicio = ?, data_fim = ?, qtd_pessoas = ?, desconto = ?, valor_final = ? WHERE id = ?";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, hosp.getEstado());
            pst.setDate(2, new java.sql.Date(hosp.getDataInicio().getTime()));
            pst.setDate(3, new java.sql.Date(hosp.getDataFim().getTime()));
            pst.setInt(4, hosp.getQtdPessoas());
            pst.setFloat(5, hosp.getDesconto());
            pst.setFloat(6, hosp.getValorFinal());
            pst.setInt(7, hosp.getId());

            int res = pst.executeUpdate();
            if (res > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    @Override
    public String excluir(Hospedagem hosp) {
        String sql = "DELETE FROM hospedagem WHERE id = ?";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, hosp.getId());

            int res = pst.executeUpdate();
            if (res > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    @Override
    public List<Hospedagem> listarTodos() {
        String sql = "SELECT * FROM hospedagem";
        Connection con = ConnectionFactory.getConnection();
        List<Hospedagem> lista = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String estado = rs.getString("estado");
                java.sql.Date dataInicio = rs.getDate("data_inicio");
                java.sql.Date dataFim = rs.getDate("data_fim");
                int qtdPessoas = rs.getInt("qtd_pessoas");
                float desconto = rs.getFloat("desconto");
                float valorFinal = rs.getFloat("valor_final");

                Hospedagem hosp = new Hospedagem(id, estado, dataInicio, dataFim, qtdPessoas, desconto, valorFinal);
                lista.add(hosp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.close(con);
        }
        return lista;
    }
}
