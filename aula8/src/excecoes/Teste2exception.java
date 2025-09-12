package excecoes;

public class Teste2exception {

	public static void main(String[] args) {
		
		try {
			int vetor[] = {1, 2, 3};
			String texto = "teste";
			System.out.println(texto.toUpperCase());
			System.out.println(vetor[5]);
			
		} catch (NullPointerException e) {
			System.out.println("Esqueceu de Instanciar!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição do vetor invalida!");
		}
	}

}
