package exemplos;

public class ProdutoExercicio {

	private String descricao;
	private double valor;
	private int quantidade;

	public ProdutoExercicio(String descricao, double valor, int quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public double calcularIcms () {
		return calculoValor() * 0.12;
	}
	
	public double calculoValor () {
		return valor * quantidade;
	}
	
	public double total() {
		return calculoValor() + calcularIcms();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
