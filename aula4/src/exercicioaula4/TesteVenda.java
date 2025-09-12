package exercicioaula4;

import java.util.Scanner;

public class TesteVenda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Fixo vendedor1 = new Fixo("Adryan", "1111111111", 2150, 5.0);
		Fixo vendedor2 = new Fixo("Elisa", "2222222222", 2000, 5.0);

		double totalVendido = 0;
		String resposta;

		do {
			System.out.println("------ Sistema de Vendas ------\n");
			System.out.println("Vendedores:");
			System.out.println("1- Adryan");
			System.out.println("2- Elisa");
			System.out.println("Escolha o vendedor:");
			int escolha = sc.nextInt();
			
			if(escolha != 1 && escolha != 2) {
				System.out.println("Escolha inválida!");
				System.out.println("Deseja continuar?");
				resposta = sc.next();
				if(resposta.equalsIgnoreCase("s")) continue;
				else if(resposta.equalsIgnoreCase("n")) break;
			}

			System.out.println("Digite o valor da venda:");
			
			double valorVenda = sc.nextDouble();
			totalVendido += valorVenda;
			
			if (escolha == 1) {
				vendedor1.calcularSalario(valorVenda);
			} else if (escolha == 2) {
				vendedor2.calcularSalario(valorVenda);
			} else {
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Deseja continuar?");
			resposta = sc.next();

		} while (!resposta.equalsIgnoreCase("N"));

		System.out.println("\n--- Salário dos vendedores ---");
		System.out.println("Nome: " + vendedor1.getNome());
		System.out.println("Salário Bruto Final: " + vendedor1.getSalarioBruto());
		System.out.println("--------------------\n");
		System.out.println("Nome: " + vendedor2.getNome());
		System.out.println("Salário Bruto Final: " + vendedor2.getSalarioBruto());

		System.out.println("\nTotal Vendido:");
		System.out.println(totalVendido);
		sc.close();
	}

}
