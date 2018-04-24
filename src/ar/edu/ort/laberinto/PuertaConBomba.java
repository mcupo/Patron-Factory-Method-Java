package ar.edu.ort.laberinto;

//Clase ProductoConcreto
public class PuertaConBomba extends Puerta {
	
	public PuertaConBomba(Habitacion habitacion1, Habitacion habitacion2) {
		super(habitacion1, habitacion2);
	}

	public void Entrar(){}

	@Override
	public void dibujar() {
		System.out.println("Implementacion de dibujar");
	}
	
}