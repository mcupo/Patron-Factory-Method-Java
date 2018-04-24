package ar.edu.ort.laberinto;

import java.util.ArrayList;

//Clase ProductoConcreto
public class Laberinto implements Dibujable {
	
	private ArrayList<Habitacion> habitaciones;
	
    public void Laberinto() {
    	habitaciones = new ArrayList<Habitacion>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
    	habitaciones.add(habitacion);
    }

	@Override
	public void dibujar() {
		System.out.println("Implementacion de dibujar");
	}

}
