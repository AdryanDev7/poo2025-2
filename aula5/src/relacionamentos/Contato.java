package relacionamentos;

import java.util.Arrays;

public class Contato {

	private String nome;
	private Telefone[] telefones;

	@Override
	public String toString() {
		return "Contato Nome: " + nome + "\nTelefones: " + Arrays.toString(telefones);
	}

	public Contato(String nome, Telefone[] telefones) {
		super();
		this.nome = nome;
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

}
