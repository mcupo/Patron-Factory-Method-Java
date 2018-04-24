package ar.edu.ort.laberinto;

//Clase ProductoConcreto
public class HabitacionEncantada extends Habitacion {

	private String	hechizo;

	public HabitacionEncantada(int numero, String hechizo){
		super(numero);
		this.hechizo = hechizo;
		
	}
	
	public void Entrar() {
		System.out.println("Implementacion de entrar");
	}

	@Override
	public void dibujar() {
		System.out.println("Implementacion de entrar");
	}
	
	public String getHechizo() {
		return hechizo;
	}
}
