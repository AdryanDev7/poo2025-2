package exemplos;

public class Campeonato {

	private int id;
	private String time;
	private int pontos;
	private static int cont=0;

	//Construtor não tem retorno e não é void
	//public Campeonato() {
	//System.out.println("construtor executado!");{
	
	
	//Overload - mesmo nome com argumentos diferentes
	public Campeonato(int codigo, String time, int pontos) {
		this.id = codigo;
		this.time = time;
		this.pontos = pontos;
		cont++;
	}
	
	public static int getCont() {
		return cont;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
}
