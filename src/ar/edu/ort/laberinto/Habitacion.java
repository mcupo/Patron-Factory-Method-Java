package ar.edu.ort.laberinto;

//Clase ProductoConcreto
public class Habitacion implements Dibujable {

	private Dibujable[]	lados;
	private int  		numero;

	public Habitacion(int numero){
		this.numero = numero;
		lados = null;
	}
	
	public void Entrar() {
		System.out.println("Implementacion de entrar");
	}

	@Override
	public void dibujar() {
		System.out.println("Implementacion de entrar");
	}
	
	public Dibujable[] getLados() {
		return lados;
	}

	public void setLados(Dibujable[] lados) {
		this.lados = lados;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
