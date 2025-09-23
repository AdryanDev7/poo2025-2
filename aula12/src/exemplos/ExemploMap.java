package exemplos;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
		HashMap<String, String> estados = new HashMap<>();
		estados.put("AL", "Alagoas");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("CE", "Ceará");
		estados.put("RS", "Rio Grande do Sul");

		//imprimir chave
		for (String chave : estados.keySet()) {
			System.out.println(chave);
		}

		//imprimir valor
		for (String valor : estados.values()) {
			System.out.println(valor);
		}
		
		//imprimir chave e valor
		for (Map.Entry<String, String> dados : estados.entrySet()) {
			System.out.println(dados.getKey() + "-" + dados.getValue());
			
		}
	}

}
