package exemplos;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {
		Date dataAtual = new Date();
		
		LocalDate dataHoje = LocalDate.now();
		System.out.println(LocalDate.of(2025,9, 17));
		
		
	}

}
