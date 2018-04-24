package ar.edu.ort.laberinto;

//Clase Creador
public class JuegoDelLaberintoConBomba extends JuegoDelLaberinto {
	
	//En esta caso solo sobreescribo los métodos que devuelven objetos distintos al de la clase madre
	public Habitacion fabricarHabitacion(int numero, String hechizo) {
		return new HabitacionConBomba(numero, hechizo);
	}
	
	public Puerta FabricarPuerta(Habitacion habitacion1, Habitacion habitacion2) {
		return new PuertaConBomba(habitacion1,habitacion2);
	}
}