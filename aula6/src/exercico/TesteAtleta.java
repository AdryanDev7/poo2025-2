package exercico;

public class TesteAtleta {

	public static void main(String[] args) {

		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("Argentina");
		Pais pais3 = new Pais("Bolívia");

		Atleta at1 = new Atleta("Anderson Silva", 80.0);
		Atleta at2 = new Atleta("Jon Jone", 100.0);
		Atleta at3 = new Atleta("Vitor Belfort", 10.0);

		/*
		System.out.println(at1.toString() + pais1.toString() +
		 at1.verificaSituacao());
		 System.out.println("-------------------------------------");
		 System.out.println(at2.toString() + pais2.toString() +
		 at2.verificaSituacao());
		 System.out.println("-------------------------------------");
		 System.out.println(at3.toString() + pais3.toString() +
		 at3.verificaSituacao());
		 */
		
		System.out.println("O atleta " + at1.getNome() + at1.verificaSituacao());
		System.out.println("O atleta " + at2.getNome() + at2.verificaSituacao());
		System.out.println("O atleta " + at3.getNome() + at3.verificaSituacao());
		System.out.println("Total de participantes: " + at1.getTotalParticipantes());
	}
}
