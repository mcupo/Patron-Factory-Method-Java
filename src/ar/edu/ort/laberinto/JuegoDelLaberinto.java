package ar.edu.ort.laberinto;

//Clase Creador
public class JuegoDelLaberinto {
	
	public Dibujable crearLaberinto() {
		Laberinto unLaberinto	= (Laberinto) fabricarLaberinto();
		Habitacion habitacion1  = (Habitacion) fabricarHabitacion(1);
		Habitacion habitacion2  = (Habitacion) fabricarHabitacion(2);
		Puerta unaPuerta        = (Puerta) FabricarPuerta(habitacion1, habitacion2);
		unLaberinto.agregarHabitacion(habitacion1);
		unLaberinto.agregarHabitacion(habitacion2);
		Dibujable lados[] = {fabricarPared(), unaPuerta, fabricarPared(), fabricarPared()};
		habitacion1.setLados(lados);
		//...
		return unLaberinto;
	}
	
	public Dibujable fabricarLaberinto() {
		return new Laberinto();
	}

	public Dibujable fabricarHabitacion(int numero) {
		return new Habitacion(numero);
	}

	public Dibujable fabricarPared() {
		return new Pared();
	}
	
	public Dibujable FabricarPuerta(Habitacion habitacion1, Habitacion habitacion2) {
		return new Puerta(habitacion1,habitacion2);
	}
}