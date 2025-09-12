package revisao;

//Classe abstract serve para instanciar somente filhos.
public abstract class Empregado {
	protected String nome;
	protected double salario;
	protected Setor setor;

	public Empregado(String nome, double salario, Setor setor) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "Nome: " + nome + "\nSalario: " 
								+ salario + "Setor: " + setor;
	}
	
	//Método abstract não contém implementação. A implementação sera nos filhos.
	public abstract double calcularHoraExtra();

}
