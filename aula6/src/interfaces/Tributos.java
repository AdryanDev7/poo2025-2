package interfaces;

public interface Tributos extends Taxas, ImpostoRenda{

	double calcularIcms();
	double calcularIpi();
}
