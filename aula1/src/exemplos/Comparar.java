package exemplos;

public class Comparar {
	public static void main(String[] args) {
		
		int n1 = 10, n2 = 5;
			
		if (n1 > n2) {
			System.out.println("Número 1 é maior");
		} else if (n2 > n1){
			System.out.println("Número 2 é maior");
		}
		else {
			System.out.println("Número iguais");
		}
	}

	// Operador Ternário
	// System.out.println(n1 > n2 ? "n1 maior" : "n2 maior" ? n2 > n1 : "n2 maior" : "Iguais");
	// Na variavel
	// resultado = n1 > n2 ? "n1 maior" : "n2 maior" ? n2 > n1 : "n2 maior" : "Iguais" 
}
