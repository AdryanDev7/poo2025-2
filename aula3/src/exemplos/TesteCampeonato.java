package exemplos;

public class TesteCampeonato {

	public static void main(String[] args) {
		
		//Construtor -> é chamado sempre na instancia do objeto
		Campeonato c1 = new Campeonato(1, "Vasco", 10);
		Campeonato c2 = new Campeonato(2, "Fluminense", 60);
		Campeonato c3 = new Campeonato(3, "Flamengo", 90);
		
		System.out.println(c1.getTime() + " " + c1.getPontos());
		System.out.println(c2.getTime() + " " +c2.getPontos());
		System.out.println(c3.getTime() + " " +c3.getPontos());
		System.out.println("Total de Times:" + Campeonato.getCont());
		
	}

}
