package interfaces;

// Interface não permite new
// Todos os metodos sao abstratos
// Interface não tem implementação por enquanto
public interface Conta {

//	Assinatura para implementação dos dados.
	public double saque(double valor);

	public double deposito(double valor);

	public double transferir(double valor);

	public double pix(double valor);
}
