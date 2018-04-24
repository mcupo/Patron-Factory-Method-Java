package ar.edu.ort.laberinto;

//Clase ProductoConcreto
public class PuertaHechizable extends Puerta {
	
	public PuertaHechizable(Habitacion habitacion1, Habitacion habitacion2) {
		super(habitacion1, habitacion2);
	}

	public void Entrar() {
		System.out.println("Implementacion de entrar");
	}

	@Override
	public void dibujar() {
		System.out.println("Implementacion de dibujar");
	}
	
}