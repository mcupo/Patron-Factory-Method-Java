package ar.edu.ort.laberinto;

//Clase Creador
public class JuegoDelLaberinto {
	
	public Dibujable crearLaberinto() {
		Dibujable unLaberinto	= fabricarLaberinto();
		Habitacion habitacion1  = fabricarHabitacion(1);
		Habitacion habitacion2  = fabricarHabitacion(2);
		Puerta unaPuerta        = FabricarPuerta(habitacion1, habitacion2);
		((Laberinto) unLaberinto).agregarHabitacion(habitacion1);
		((Laberinto) unLaberinto).agregarHabitacion(habitacion2);
		Dibujable lados[] = {fabricarPared(), unaPuerta, fabricarPared(), fabricarPared()};
		habitacion1.setLados(lados);
		//...
		return unLaberinto;
	}
	
	public Dibujable fabricarLaberinto() {
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