package ar.edu.ort.laberinto;

public class Test {

	public static void main(String[] args) {
		//Puedo crear un labertino comun
	    JuegoDelLaberinto juego = new JuegoDelLaberinto();
	    Dibujable unLaberintoComun = juego.crearLaberinto();
	    unLaberintoComun.dibujar();
		
	    //Puedo crear un laberinto encantado
	    JuegoDelLaberinto juegoEncantado = new JuegoDelLaberintoEncantado();
	    Dibujable unLaberintoEncantado = juegoEncantado.crearLaberinto();
	    unLaberintoEncantado.dibujar();
	    
	    //Puedo crear un laberinto con bombas
	    JuegoDelLaberinto juegoConBomba = new JuegoDelLaberintoEncantado();
	    Dibujable unLaberintoConBomba = juegoConBomba.crearLaberinto();
	    unLaberintoConBomba.dibujar();
	}
}