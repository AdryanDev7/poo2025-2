package relacionamentos;

import revisao.Pessoa;

public class TesteImovel {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Adryan", "123");
		Pessoa pessoa2 = new Pessoa("Elisa", "124");
		
		imovel imovel1 = new imovel("Rua Binguen", "apto", 189000., pessoa1);
		
		System.out.println(imovel1.toString());
		
	}

}
