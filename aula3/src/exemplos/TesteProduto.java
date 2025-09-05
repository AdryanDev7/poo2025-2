package exemplos;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setDescricao("Notebook");
		produto.setPreco(2000.);
		
		System.out.println("Codigo: " + produto.getCodigo() + 
		"\nDescrição: " + produto.getDescricao() + "\nPreço: " + produto.getPreco());
	}

}
