package exercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {

	private String categoria;
	
	
	public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}
	

	public String getCategoria() {
		return categoria;
	}

	public double lavarVeiculo() {
		return valorCobrado;
		
	}
	
	public double trocarOleo() {
		
		TipoServico.OLEO.getValorPorServico();
		if(dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
			return valorCobrado -= 50;
		}else {
			return valorCobrado;
		}
	}
	
	public double revisao() {
		TipoServico.REVISAO.getValorPorServico();
		if(dataConserto.getMonth() == Month.AUGUST) {
			return valorCobrado *= 0.90;
		}else {
			return valorCobrado;
		}
	}

}
