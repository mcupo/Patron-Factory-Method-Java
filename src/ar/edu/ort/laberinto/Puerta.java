package ar.edu.ort.laberinto;

//Clase ProductoConcreto
public class Puerta implements Dibujable {

	private Habitacion 	habitacion1;
	private Habitacion 	habitacion2;
	private boolean		estaAbierta;

	public Puerta(Habitacion habitacion1, Habitacion habitacion2){
		this.habitacion1 = habitacion1;
		this.habitacion2 = habitacion2;
	}
	
	public void Entrar(){}

	@Override
	public void dibujar() {
		System.out.println("Implementacion de dibujar");
	}

	public Habitacion getHabitacion1() {
		return habitacion1;
	}

	public void setHabitacion1(Habitacion habitacion1) {
		this.habitacion1 = habitacion1;
	}

	public Habitacion getHabitacion2() {
		return habitacion2;
	}

	public void setHabitacion2(Habitacion habitacion2) {
		this.habitacion2 = habitacion2;
	}

	public boolean isEstaAbierta() {
		return estaAbierta;
	}

	public void setEstaAbierta(boolean estaAbierta) {
		this.estaAbierta = estaAbierta;
	}
}
