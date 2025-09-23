package testes;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import entity.Fornecedor;

public class ExemploSerializable {

	public static void main(String[] args) {

		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(new Fornecedor("123", "ABC 123"));
		fornecedores.add(new Fornecedor("345", "XPTO 345"));

		try {
			FileOutputStream arquivo = new FileOutputStream("/curso/fornecedor.dat");
			ObjectOutputStream gravarArquivo = new ObjectOutputStream(arquivo);
			gravarArquivo.writeObject(fornecedores);
			gravarArquivo.flush();
			gravarArquivo.close();
			System.out.println("Arquivo gravado no disco com sucesso!");
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		}
	}
		
}
