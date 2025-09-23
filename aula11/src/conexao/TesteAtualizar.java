package conexao;

import entity.Cliente;
import persistence.ClienteDao;

public class TesteAtualizar {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Jose", "j@gmail.com", "22222");
		ClienteDao dao = new ClienteDao();
		dao.atualizar(cliente);
		System.out.println("Cliente alterado com sucesso!");
		
		
	}

}
