package relacionamentos;

public class Cidade {

	private String nomeCidade;
	private Estado estado;
	@Override
	public String toString() {
		return "Nome da Cidade: " + nomeCidade + "Estado: " + estado;
	}
	public Cidade(String nomeCidade, Estado estado) {
		super();
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}
	
}
