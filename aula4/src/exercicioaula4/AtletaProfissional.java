package exercicioaula4;

public class AtletaProfissional extends Maratona {

	double peso;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	@Override
	public String toString() {
		return super.toString() + "Peso: " + peso;
	}

}
