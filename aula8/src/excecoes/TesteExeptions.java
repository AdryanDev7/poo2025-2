package excecoes;

public class TesteExeptions {

	public static void main(String[] args) {
		try {
		System.out.println(calcular(10,0));
		System.out.println("teste");
		}catch (ArithmeticException e) {
			System.out.println("Vc dividiu um numero por zero!");
		}
		
	}

	public static int calcular(int a, int b) {
		/*if(b==0) {
			throw new ArithmeticException("Divisão por zero");
		}*/
		return a/b;
	}
}
