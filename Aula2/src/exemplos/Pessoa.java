package exemplos;
public class Pessoa {

	private String nome;
	private double peso, altura;

//========================================	

	// método para entrada de dados
	public void setNome(String nome) {
		this.nome = nome;
	}

	// método para retorno de atributo
	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso <= 0) {
			System.out.println("Peso inválido");
		}else {
			this.peso = peso;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
//=============================================	

	// ENCAPSULAMENTO
	private double IMC() {

		return peso / (altura * altura);
	}
//=============================================

	public String resultado() {

		if (IMC() < 18.5) {
			return "Abaixo do peso";
		} else if (IMC() <= 24.9) {
			return "Peso ideal";
		} else {
			return "Acima do peso";
		}
	}
}
