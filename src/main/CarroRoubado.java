package main;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {
	private String acao = "";

	public void frente() {
		acao = "frente";
		System.out.println("Carro Roubado segue em frente.");
		this.mudaEstado();
	}

	public void direita() {
		acao = "direita";
		System.out.println("Carro Roubado vida a direita.");
		this.mudaEstado();
	}

	public void esquerda() {
		acao = "esquerda";
		System.out.println("Carro Roubado vida a esquerda.");
		this.mudaEstado();
	}

	public void para() {
		acao = "para";
		System.out.println("Carro Roubado para.");
		this.mudaEstado();
	}

	public void mudaEstado() {
		setChanged(); // Mudou o estado
		notifyObservers(acao); // Notifica os observadores
	}

	public String getAcao() {
		return acao;
	}
	
	

}
