package conexao;

import java.sql.Connection;

public class TesteConexão {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
	}

}
