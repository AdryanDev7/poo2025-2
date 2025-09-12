package relacionamentos;

import java.util.Arrays;

public class Time {

	private String nome;
	private String treinador;
	private Atleta[] atletas;

	public Time(String nome, String treinador, Atleta[] atletas) {
		super();
		this.nome = nome;
		this.treinador = treinador;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\ntreinador: " + treinador + "\natletas: "
				+ Arrays.toString(atletas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTreinador() {
		return treinador;
	}

	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public void adicionarAtleta(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if(atletas[i]==null)
				atletas[i] = atleta;
				return;
		}
	}
	
	public void imprimirAtletas() {
		for (int i = 0; i < atletas.length; i++) {
			if(atletas[i] != null)
			System.out.println(atletas[i].getNome());
		}
	}
	
	
}
