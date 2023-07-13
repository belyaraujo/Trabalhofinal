package br.com.prog2.chale.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import br.com.prog2.chale.model.Cliente;

public class ClienteDAOImp implements ClienteDAO {
	@Override
	public String inserir(Cliente cli) {
		String sql = "insert into cliente(nome,rg,endereco,bairro,cidade,estado,cep,nascimento )values (?,?,?,?,?,?,?,?)";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, cli.getnomeCliente());
			pst.setInt(2, cli.getrgCliente());
			pst.setString(3, cli.getenderecoCliente());
			pst.setString(4, cli.getbairroCliente());
			pst.setString(5, cli.getcidadeCliente());
			pst.setString(6, cli.getestadoCliente());
			pst.setInt(7, cli.getCEPCliente());
			pst.setDate(8, cli.getnascimentoCliente());
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
	public String alterar(Cliente cli) {
		String sql = "update cliente set nome=? ,endereco=?,bairro=?,cidade=?,estado=?,cep=?,nascimento=? where rg=?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, cli.getnomeCliente());
			pst.setInt(2, cli.getrgCliente());
			pst.setString(3, cli.getenderecoCliente());
			pst.setString(4, cli.getbairroCliente());
			pst.setString(5, cli.getcidadeCliente());
			pst.setString(6, cli.getestadoCliente());
			pst.setInt(7, cli.getCEPCliente());
			pst.setDate(8, cli.getnascimentoCliente());
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
	public String excluir(Cliente cli) {
		String sql = "delete from cliente where rg=?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, cli.getrgCliente());
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
	public List<Cliente> listarTodos() {
		String sql = "select * from empregado";
		Connection con = ConnectionFactory.getConnection();
		List<Cliente> lista = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Cliente ep = new Cliente();
					ep.setnomeCliente(rs.getString(1));
					ep.setrgCliente(rs.getString(2));
					ep.setenderecoCliente(rs.getString(3));
					ep.setbairroCliente(rs.getString(4));
					ep.setcidadeCliente(rs.getString(5));
					ep.setestadoCliente(rs.getString(6));
					ep.setCEPCliente(rs.getInt(7));
					ep.setnascimentoCliente(rs.getDate(8));
					lista.add(ep);
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

	@Override
	public Cliente pesquisarPorCpf(String cpf) {
		String sql = "select * from empregado where cpf=?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, cpf);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				CLiente ep = new CLiente();
				ep.setnomeCliente(rs.getString(1));
				ep.setrgCliente(rs.getString(2));
				ep.setenderecoCliente(rs.getString(3));
				ep.setbairroCliente(rs.getString(4));
				ep.setcidadeCliente(rs.getString(5));
				ep.setestadoCliente(rs.getString(6));
				ep.setCEPCliente(rs.getInt(7));
				ep.setnascimentoCliente(rs.getDate(8));
				return ep;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		} finally {
			ConnectionFactory.close(con);
		}
	}
}}