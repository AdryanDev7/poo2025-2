package exemplos;

public class TabuadaDois {

	public static void main(String[] args) {
		
		int numero = 2, resultado;
		
		System.out.println("Tabuada do dois: ");
		
		for(int i=1; i<=10; i++) {
			
			resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}

}
