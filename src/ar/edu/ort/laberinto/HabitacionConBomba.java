package ar.edu.ort.laberinto;

//Clase ProductoConcreto
public class HabitacionConBomba extends Habitacion {

	private String	bomba;

	public HabitacionConBomba(int numero, String bomba){
		super(numero);
		this.bomba = bomba;
		
	}
	
	public void Entrar() {
		System.out.println("Implementacion de entrar");
	}

	@Override
	public void dibujar() {
		System.out.println("Implementacion de dibujar");
	}
	
	public String getBomba() {
		return bomba;
	}
}
