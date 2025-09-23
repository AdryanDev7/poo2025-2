package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entity.Empregado;

public class LeituraGravacao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo:\n");
		String nomeArquivo = sc.nextLine();

		File file = new File(nomeArquivo);
		try {
			Scanner sc2 = new Scanner(file);
			Set<Empregado> empregados = new HashSet<>();
			while (sc2.hasNext()) {
				String linha = sc2.nextLine();
				if (!linha.isEmpty()) {
					String[] dados = linha.split(";");
					String nome = dados[0];
					String profissao = dados[1];
					empregados.add(new Empregado(nome, profissao));
				}
			}
			sc2.close();
			System.out.println("---Leitura Arquivo---");
			for (Empregado e : empregados) {
				System.out.println(e);
			}

			System.out.println("--- Gravação Arquivo ---");
			FileWriter caminho = new FileWriter("\\aula\\empregadoFolha.csv");
			PrintWriter gravar = new PrintWriter(caminho);

			for (Empregado e : empregados) {
				String linhaArquivo = e.getNome() + "|" + e.getProfissao() + "\n";
				gravar.printf(linhaArquivo);
			}
			gravar.close();

		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado!");
		} catch (IOException e1) {
			System.out.println("Arquivo de saida com problemas");
		}

	}
}