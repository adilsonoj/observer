package main;

public class Run {

	public static void main(String[] args) {
		// Oberservado
		CarroRoubado carroRoubado = new CarroRoubado();

		// Oberservado
		CarroPolicia carroPolicia = new CarroPolicia();

		// obsrevado fica amarrado ao oberservador
		carroRoubado.addObserver(carroPolicia);

		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.esquerda();
		carroRoubado.para();

	}

}
