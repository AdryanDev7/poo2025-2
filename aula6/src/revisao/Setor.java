package revisao;

public class Setor {

	private int setor;
	private String descricao;

	public Setor(int setor, String descricao) {
		super();
		this.setor = setor;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Setor: " + setor + "\ndescricao: " + descricao;
	}

	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
