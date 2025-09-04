package exemplos;

public class Conta {

	// ATRIBUTOS
	int numero;
	String titular;
	double saldo;
	
	// Compartimentps da classe - MÉTODOS
	
	//método sem retorno
	public void deposito(double valor) {
		saldo += valor;
		System.out.println("Deposito realizado com sucesso");
	}
	
	//Método com retorno
	public boolean saque(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			//System.out.println("Saque efetuado com sucesso");
			return true;
		}else {
			//System.out.println("Saque não efetuado");
			return false;
		}
	}
	
	
}
