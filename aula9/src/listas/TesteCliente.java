package listas;

import java.util.ArrayList;
import java.util.List;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Adryan", "adryan@gmail.com");
		Cliente cl2 = new Cliente("Marcos", "marcos@gmail.com");
		Cliente cl3 = new Cliente("Rodrigo", "rodrigo@gmail.com");
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cl1);
		clientes.add(cl2);
		clientes.add(cl3);
		
		for (Cliente c : clientes) {
			System.out.println(c.getNome() + " - " + c.getEmail());
		}
	}

}
