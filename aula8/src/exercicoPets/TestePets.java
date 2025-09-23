package exercicoPets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestePets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Animal[] vetorDeAnimais = new Animal[30];
		LojaPets loja = new LojaPets("Petshop", vetorDeAnimais, 0);

		loja.adicionarAnimal(new Cachorro("Bob", 2, "Labrador"));
		loja.adicionarAnimal(new Gato("Miau", 1, "Preto"));

		int opcao = 0;

		do {
			System.out.println("\n===== LOJA DE PETS =====");
			System.out.println("1. Adicionar um novo animal");
			System.out.println("2. Listar animais para adoção");
			System.out.println("3. Adotar um animal");
			System.out.println("4. Sair do sistema");
			System.out.print("Digite sua escolha: ");

			try {
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					System.out.print("O novo animal é (1) Cachorro ou (2) Gato? ");
					int tipoAnimal = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Digite o nome do animal: ");
					String nome = scanner.nextLine();

					System.out.print("Digite a idade: ");
					int idade = scanner.nextInt();
					scanner.nextLine();

					if (tipoAnimal == 1) {
						System.out.print("Digite a raça do cachorro: ");
						String raca = scanner.nextLine();
						loja.adicionarAnimal(new Cachorro(nome, idade, raca));
					} else if (tipoAnimal == 2) {
						System.out.print("Digite a cor do gato: ");
						String cor = scanner.nextLine();
						loja.adicionarAnimal(new Gato(nome, idade, cor));
					} else {
						System.out.println("Tipo de animal inválido!");
					}
					break;

				case 2:
					loja.listarAnimais();
					break;

				case 3:
					loja.listarAnimais();
					System.out.print("Digite o número (índice) do animal que deseja adotar: ");
					int indiceParaAdotar = scanner.nextInt();
					try {
						loja.adotarAnimal(indiceParaAdotar);
					} catch (AnimalException e) {
						System.err.println("ERRO: " + e.getMessage());
					}
					break;

				case 4:
					System.out.println("Obrigado por usar nosso sistema!");
					break;

				default:
					System.out.println("Opção inválida! Por favor, escolha um número de 1 a 4.");
					break;
				}
			} catch (InputMismatchException e) {
				System.err.println("ERRO: Por favor, digite apenas números.");
				scanner.nextLine();
				opcao = 0;
			}

		} while (opcao != 4);

		scanner.close();
	}
}