package exemplos;

public class ExemploSwitch2 {

	public static void main(String[] args) {
		
		String cidade = "Petrópolis";
		
		String resultado = switch (cidade) {
		case "Petrópolis", "Teresópolis", "Areal" -> "Rio de Janeiro"; 
		case "Juiz de Fora", "Mar de Espanha", "Rio Pomba" -> "Minas Gerais"; 	
		default -> "Outro Estado";
		};
		System.out.println(resultado);
	}
}
