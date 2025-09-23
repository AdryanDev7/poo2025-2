package listas;

public class ExemploVarArgs {

	public static void main(String[] args) {				//varios argumentos
		System.out.println("Resultado soma: " + calcularSoma(10, 20, 30, 50, 2));
	}

	//deixa eu colocar quantos argumentos quiser
	public static int calcularSoma(int... numeros) {
		int soma = 0;

		for (int i : numeros) {
			soma += i;
		}
		return soma;
	}

}
