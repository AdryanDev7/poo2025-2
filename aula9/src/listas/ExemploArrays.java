package listas;

import java.util.Arrays;
import java.util.List;

public class ExemploArrays {

	public static void main(String[] args) {
		//Não suporta novos elementos
		List<String> animais = Arrays.asList("Gato", "Cachorro", "Trige");
	
	animais.set(0,"Coruja");
	System.out.println(animais);
	
	
	}
}
