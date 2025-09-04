package exemplos;
public class TestePessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();	
		
		//Atribuição Direta para o atributo
	/*
		pessoa.nome = "Marcos";
		pessoa.altura = 1.80;
		pessoa.peso = 70.5;
	*/
		pessoa.setNome("Marcos");
		pessoa.setAltura(1.80);
		pessoa.setPeso(70.5);
		
		System.out.println("Nome:" + pessoa.getNome());
		System.out.println("Resultado IMC:" + pessoa.resultado());
	}
}
