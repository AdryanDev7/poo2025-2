package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\aula\\exercicio.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.next());

			}
		} catch (FileNotFoundException e) {
			System.out.println("Aruivo não encontrado!");
		}
	}
}
