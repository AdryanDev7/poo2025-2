package relacionamentos;

public class TesteEndereco {

	public static void main(String[] args) {
		
		Estado estado = new Estado("Rio de janeiro", "RJ");
		Cidade cidade = new Cidade("Duque de Caxias", estado);
		Contato contato = new Contato("Adryan", new Telefone[2]);
		Endereco endereco = new Endereco("Rua Glória Maria", "Santa Cruz", "25243289", cidade);
		Telefone telefone1 = new Telefone("123456789");
		Telefone telefone2 = new Telefone("987654321");
		
		System.out.println(contato.toString());
		System.out.println(endereco.toString());
		System.out.println(telefone1.toString());
		System.out.println(telefone2.toString());
		
		
	}

}
