package br.com.prog2.chale.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.prog2.chale.model.Chale;

public class ChaleDAOImp implements ChaleDAO {

    @Override
    public String inserir(Chale cha) {
        String sql = "insert into chale (id, localizacao, capacidade, valor_alta_estacao, valor_baixa_estacao) values (?, ?, ?, ?, ?)";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, cha.getId());
            pst.setString(2, cha.getLocalizacao());
            pst.setInt(3, cha.getCapacidade());
            pst.setFloat(4, cha.getValorAltaEstacao());
            pst.setFloat(5, cha.getValorBaixaEstacao());
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
    public String alterar(Chale cha) {
        String sql = "update chale set localizacao=?, capacidade=?, valor_alta_estacao=?, valor_baixa_estacao=? where id=?";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cha.getLocalizacao());
            pst.setInt(2, cha.getCapacidade());
            pst.setFloat(3, cha.getValorAltaEstacao());
            pst.setFloat(4, cha.getValorBaixaEstacao());
            pst.setInt(5, cha.getId());
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
    public String excluir(Chale cha) {
        String sql = "delete from chale where id=?";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, cha.getId());
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
    public List<Chale> listarTodos() {
        String sql = "select * from chale";
        Connection con = ConnectionFactory.getConnection();
        List<Chale> lista = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Chale cha = new Chale();
                    cha.setId(rs.getInt(1));
                    cha.setLocalizacao(rs.getString(2));
                    cha.setCapacidade(rs.getInt(3));
                    cha.setValorAltaEstacao(rs.getFloat(4));
                    cha.setValorBaixaEstacao(rs.getFloat(5));
                    lista.add(cha);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }
}
