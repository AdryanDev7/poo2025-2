package relacionamentos;

public class Telefone {

	private String numero;

	public Telefone(String numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone Numero: " + numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
