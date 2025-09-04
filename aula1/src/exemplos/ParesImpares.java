package exemplos;

public class ParesImpares {

	public static void main(String[] args) {
		
		int i, par=0, impar=0;
	
		for(i=1; i<=30; i++) {
			if(i % 2 == 0) {
				par++;
			} else
				impar++;
		}
		System.out.println("Total de pares: " + par);
		System.out.println("Total de impares: " + impar);
	}
}
