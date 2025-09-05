package exemplos;

import java.util.Scanner;

public class TesteProdutoExercicio {

	public static void main(String[] args) {
		
		String resposta;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Digite o produto: ");
		String descricao = sc.next();
		
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
	
		System.out.println("Digite o Valor: ");
		double valor = sc.nextDouble();
		
		ProdutoExercicio produto = new ProdutoExercicio(descricao, valor, quantidade);
		
		System.out.println("descrição: " + "\nValor: " + produto.calculoValor() + "\nICMS: " 
		+ produto.calcularIcms() + "\nTotal: " + produto.total());
		
		System.out.println("Deseja continuar com o programa? (s/n)");
		resposta = sc.next();
		
		} while(!resposta.equalsIgnoreCase("N"));
		
		System.out.println("Programa encerrado!");
		sc.close();
	}
}
