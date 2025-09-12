package relacionamentos;

public class Atleta {

	private String nome;
	private String posicao;

	public Atleta(String nome, String posicao) {
		super();
		this.nome = nome;
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nposicao: " + posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

}
