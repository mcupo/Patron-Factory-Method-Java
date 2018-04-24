package ar.edu.ort.laberinto;

//Clase Creador
public class JuegoDelLaberinto {
	
	public Laberinto crearLaberinto() {
		Laberinto unLaberinto	= fabricarLaberinto();
		Habitacion habitacion1  = fabricarHabitacion(1);
		Habitacion habitacion2  = fabricarHabitacion(2);
		Puerta unaPuerta        = FabricarPuerta(habitacion1, habitacion2);
		unLaberinto.agregarHabitacion(habitacion1);
		unLaberinto.agregarHabitacion(habitacion2);
		Dibujable lados[] = {fabricarPared(), unaPuerta, fabricarPared(), fabricarPared()};
		habitacion1.setLados(lados);
		//...
		return unLaberinto;
	}
	
	public Laberinto fabricarLaberinto() {
		return new Laberinto();
	}

	public Habitacion fabricarHabitacion(int numero) {
		return new Habitacion(numero);
	}

	public Pared fabricarPared() {
		return new Pared();
	}
	
	public Puerta FabricarPuerta(Habitacion habitacion1, Habitacion habitacion2) {
		return new Puerta(habitacion1,habitacion2);
	}
}