package testes;
import java.util.Arrays;
import java.util.List;

import entity.Fornecedor;

public class TesteEquals {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor("123", "ABC 123");
		Fornecedor f2 = new Fornecedor("123", "ABC 123");
		Fornecedor f3 = new Fornecedor("123", "ABCD 1234");
		
		List<Fornecedor> fornecedores = Arrays.asList(f1,f2,f3);
		
	}

}
