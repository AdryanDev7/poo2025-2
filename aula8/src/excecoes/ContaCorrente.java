package excecoes;

public class ContaCorrente implements Conta {

	private String titular;
	private double saldo;

	public ContaCorrente(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "Titular: " + titular + "\nSaldo: " + saldo;
	}

	@Override
	public boolean saque(double valor) {
		if(valor > saldo) {
			throw new ContaException("Saldo Insuficiente!");
		}
		return false;
	}

	@Override
	public boolean deposito(double valor) {
		if(valor <= 0) {
			throw new ContaException("Valor Inválido!");
		}
		saldo += valor;
		return true;
	}

}
