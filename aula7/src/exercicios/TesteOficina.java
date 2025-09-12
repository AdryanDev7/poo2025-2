package exercicios;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		
		Proprietario marcao = new Proprietario("Marcos");
		Carro carro = new Carro("Ferrari", 200., LocalDate.of(2025, 8, 16), marcao, "Sedan");
		Carro carro2 = new Carro("Civic", 200., LocalDate.of(2025, 8, 16), marcao, "Hatch");
		
		carro.revisao();
		carro.trocarOleo();
		
		System.out.println("\n-----Dados do Serviço -----\n");
		System.out.println(carro.toString());
		System.out.println("\nSeu carro esta pronto pra retirada");
		
		carro2.trocarOleo();
		System.out.println("\n-----Dados do Serviço -----\n");
		System.out.println(carro2.toString());
		System.out.println("\nSeu carro esta pronto pra retirada");
	}

}
