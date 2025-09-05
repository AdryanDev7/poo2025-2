package heranca;

public class TesteImposto {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("Adryan", "adryan@gmail.com", 12000., "23", "2323");
		PessoaJuridica pj = new PessoaJuridica("Xpto", "x@gmail.com", 35000., "qualquer coisa", "234");
		
		System.out.println(pf.calcularIR());
		System.out.println(pj.calcularIR());
		
		
	}

}
