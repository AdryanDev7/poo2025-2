package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConnectionFactory;
import entity.Cliente;

public class ClienteDao {
	private Connection connection;

	public ClienteDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Cliente cliente) {
		String sql = "insert into cliente(nome, email, telefone) values(?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getTelefone());
			
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Problemas ao gravar registro!");
		}
	}
	public void atualizar(Cliente cliente) {
		String sql = "update cliente set nome=?, email=?, telefone=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getTelefone());
			stmt.setInt(4, cliente.getId());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Problemas ao gravar registro!");
			e.printStackTrace();
		}
	}
	
	public void deletar(Cliente cliente) {
		String sql = "delete cliente set nome=?, email=?, telefone=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getTelefone());
			stmt.setInt(4, cliente.getId());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Problemas ao gravar registro!");
			e.printStackTrace();
		}
	}

	
	
}
