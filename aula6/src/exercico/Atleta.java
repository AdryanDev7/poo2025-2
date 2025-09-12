package exercico;

public class Atleta implements Olimpiadas {

	private String nome;
	private double peso;
	private String modalidade;
	private static int totalParticipantes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getModelidade() {
		return modalidade;
	}

	public void setModelidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public void setTotalParticipantes(int totalParticipantes) {
		this.totalParticipantes = totalParticipantes;
	}

	public Atleta(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	@Override
	public String verificaSituacao() {
		if (peso > 90) {
			modalidade = " Peso pesado.";
			totalParticipantes++;
		} else if (peso >= 60 && peso <= 90) {
			modalidade = " Peso medio.";
			totalParticipantes++;
		} else {
			modalidade = " Não Participara!";
		}
		return modalidade;
	}

	public String toString() {
		return "Nome: " + nome + "\nPeso: " + peso + "\nModalidade:" + verificaSituacao();
	}
}
