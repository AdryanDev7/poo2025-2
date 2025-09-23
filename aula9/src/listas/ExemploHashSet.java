package listas;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {

	public static void main(String[] args) {
		//Não mantém a ordem de inserção
		//Set<String> times = new HashSet<>();
		
		//mantém a ordem dos elementos
		//Set<String> times = new LinkedHashSet<>();
		
		//Ordena os elementos
		Set<String> times = new TreeSet<>();
		
		times.add("Flamengo");
		times.add("Flamengo");
		times.add("Vasco");
		times.add("América");
		times.add("Bangu");
		times.add("Vasco");
		times.add("Flamengo");
		
		System.out.println(times);
	}

}
