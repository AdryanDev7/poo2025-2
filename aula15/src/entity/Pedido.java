package entity;

import java.time.LocalDate;

public class Pedido {
	private LocalDate data;
	private Double valor;

	public Pedido(LocalDate data, Double valor) {
		super();
		this.data = data;
		this.valor = valor;
	}

	public void finalizarPedido() {
		System.out.println("Pedido encerrado!");
	}
}
