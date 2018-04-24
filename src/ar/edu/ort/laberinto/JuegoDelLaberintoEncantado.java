package ar.edu.ort.laberinto;

//Clase Creador
public class JuegoDelLaberintoEncantado extends JuegoDelLaberinto {
	
	//En esta caso solo sobreescribo los métodos que devuelven objetos distintos al de la clase madre
	public Habitacion fabricarHabitacion(int numero, String hechizo) {
		return new HabitacionEncantada(numero, hechizo);
	}
	
	public Puerta FabricarPuerta(Habitacion habitacion1, Habitacion habitacion2) {
		return new PuertaHechizable(habitacion1,habitacion2);
	}
}