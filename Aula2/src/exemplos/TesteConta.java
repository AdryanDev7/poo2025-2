package exemplos;

import java.util.Scanner;

public class TesteConta {
	public static void main(String[] args) {
		
		//Criar um novo objeto - instância
		
		Conta conta1 = new Conta();
		
		// Leitura / interação com o usuario
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o  número da conta:");
		int numero = sc.nextInt();
		
		System.out.println("Digite o titular da conta:");
		String titular = sc.next();
		
		System.out.println("Digite o saldo inicial:");
		double saldo = sc.nextDouble();
		
		System.out.println("Digite o valor do depósito:");
		double valorDeposito = sc.nextDouble();
		conta1.deposito(valorDeposito);
		
		System.out.println("Digite o valor do saque:");
		double valorSaque = sc.nextDouble();
		
	//=============================================================
		
		conta1.numero = numero;
		conta1.titular = titular;
		conta1.saldo = saldo;
		
		if (conta1.saque(valorSaque)) {
			System.out.println("Saque efetuado!");
		}else {
			System.out.println("Saque não efetuado!");
		}
		System.out.println("Saldo Atual:"+conta1.saldo);
	}
}
