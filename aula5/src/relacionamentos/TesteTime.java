package relacionamentos;

public class TesteTime {

	public static void main(String[] args) {

		Atleta atleta1 = new Atleta("Arrascaeta", "Meia");
		Atleta atleta2 = new Atleta("Pedro", "Centro-Avante");
		Atleta atleta3 = new Atleta("Jorginho", "meia");
		
		Time time = new Time("Brasil", "Anceloti", new Atleta[11]);
		
		time.adicionarAtleta(atleta1);
		time.adicionarAtleta(atleta2);
		time.adicionarAtleta(atleta3);
		
		time.imprimirAtletas();
	}

}
