package ar.edu.ort.laberinto;

//Clase ProductoConcreto
public class Pared implements Dibujable {

	public void Entrar() {
		System.out.println("Implementacion de entrar");
	}

	@Override
	public void dibujar() {
		System.out.println("Implementacion de dibujar");
	}

}
