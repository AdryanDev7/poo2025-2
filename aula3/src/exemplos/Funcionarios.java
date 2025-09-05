package exemplos;

public class Funcionarios {

	private String nome;
	private double salario;

	public Funcionarios(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public double calcularInss() {
		return salario * 0.11;
	}
	
	public double calcularValeTransporte() {
		return salario * 0.06;
	}
	
	public double calcularSalario() {
		return salario - calcularInss() - calcularValeTransporte();
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
}
