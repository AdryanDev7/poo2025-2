package testes;

import interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
/*		Conta conta = new Conta() {
			
			@Override
			public void transacao() {
				System.out.println("Transação efetuada!");
			
			}
		};
	
		Conta conta2 = new Conta() {
			
			@Override
			public void transacao() {
				
			}
		};
	
		//NOVO JEITO DE SE FAZER
		
		conta.transacao();
*/		Conta conta1 = () ->System.out.println("Transação efetuada");

	}	
}