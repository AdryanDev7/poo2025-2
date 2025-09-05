package heranca;

public class TesteFuncionario {

	public static void main(String[] args) {

		Diretor diretor = new Diretor(1, "Adryan", "23", "adryan@gmail,com", 8000., "ADM", 1000.);
		Gerente gerente = new Gerente(2, "Marcos", "21", "marcos@gmail.com", 6000., 10);
		
		System.out.println("Dados do diretor: " + diretor.toString());
		System.out.println("Salário:" + diretor.calcularFolha());
		
		System.out.println("Dados do gerente: " + gerente.toString());
		System.out.println("Salário:" + gerente.calcularFolha());
	}

}
