package revisao;

public class Tecnico extends Empregado {
	private static Setor setor;
	private String nivel;

	public Tecnico(String nome, double salario, String nivel) {
		super(nome, salario, setor);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return super.toString() + "Nivel: " + nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	// Metodo pode ser implementado
	@Override
	public double calcularHoraExtra() {
		return 0;
	}

}
