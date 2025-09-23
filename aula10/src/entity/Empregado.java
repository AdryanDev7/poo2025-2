package entity;

public class Empregado {
	private String nome;
	private String profissao;

	public Empregado(String nome, String profissao) {
		super();
		this.nome = nome;
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nProfissao: " + profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
