package entity;

import java.io.Serializable;

/**
 * Classe utilizada para identificar um fornecedor
 * @author Adryan Lima
 * @since 22-09-25
 */


public class Fornecedor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * identificador unico da classe
	 */
	
	private String cnpj;
	private String razaoSocial;

	/**
	 * Construtor com atributos principais:
	 * @param cnpj
	 * @param razaoSocial
	 */
	
	public Fornecedor(String cnpj, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	@Override
	public String toString() {
		return "-- Fornecedor -- \ncnpj: " + cnpj + "\nRazão Social: " + razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
