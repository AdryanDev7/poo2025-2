package exemplos;

import javax.swing.JOptionPane;

public class TesteFuncionarios {

	public static void main(String[] args) {

		Funcionarios fun = new Funcionarios("Adryan", 1000.0);

		fun.setNome(JOptionPane.showInputDialog("Nome: "));
		fun.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salário:")));

		JOptionPane.showConfirmDialog(null,
				"Nome: "+ fun.getNome() + "\nSalário: " + fun.getSalario() + "\nINSS: " + fun.calcularInss()
						+ "\nVale transporte: " + fun.calcularValeTransporte() + "\nSalário Líquido: "
						+ fun.calcularSalario());
	}

}
