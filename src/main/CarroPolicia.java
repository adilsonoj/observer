package main;

import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer, Carro {
	public void frente() {
		System.out.println("Carro Polícia segue em frente.");
	}

	public void para() {
		System.out.println("Carro Polícia para");
	}

	public void direita() {
		System.out.println("Carro Polícia vira a direita.");
	}

	public void esquerda() {
		System.out.println("Carro Polícia vira a esquerda.");
	}

	public void update(Observable arg0, Object arg1) {
		CarroRoubado carroObservado = (CarroRoubado) arg0;
		System.out.println(carroObservado.getAcao());
		String acao = String.valueOf(arg1);

		if (acao.equals("frente")) {
			this.frente();
		} else if (acao.equals("direita")) {
			this.direita();
		} else if (acao.equals("esquerda")) {
			this.esquerda();
		} else if (acao.equals("para")) {
			this.para();
		}

	}

}
