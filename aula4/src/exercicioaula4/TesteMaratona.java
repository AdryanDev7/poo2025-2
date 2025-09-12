package exercicioaula4;

public class TesteMaratona {

	public static void main(String[] args) {
		
		AtletaAmador atleta1 = new AtletaAmador("Adryan", "M", 18, 1.62, true);
		AtletaAmador atleta2 = new AtletaAmador("Ana", "F", 20, 1.80, false);
		
		System.out.println("--- Dados do Atleta 1 ---");
		System.out.println(atleta1);
		System.out.println("Situação: " + atleta1.verificaSituacao());
		
		System.out.println("\n--- Dados do Atleta 2 ---");
		System.out.println(atleta2);
		System.out.println("Situação: " + atleta2.verificaSituacao());
		
	}

}
