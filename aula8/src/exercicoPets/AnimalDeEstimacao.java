package exercicoPets;

public abstract class AnimalDeEstimacao implements Animal {

	protected String nome;
	protected int idade;

	public AnimalDeEstimacao(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade;
	}

	@Override
	public void imprimir() {
		System.out.println("Nome: " + this.nome + ", Idade: " + this.idade + " anos.");
	}

}
