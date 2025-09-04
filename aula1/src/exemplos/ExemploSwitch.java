package exemplos;

public class ExemploSwitch {

	public static void main(String[] args) {
		
		int avalicao = 2;
		
		switch (avalicao) {
		case 0:
			System.out.println("Ruim");
			break;
		case 1:
			System.out.println("Regular");
			break;
		case 2:
			System.out.println("Bom");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
}
