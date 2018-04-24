package ar.edu.ort.parametrizados;

public class DocumentoDibujoPNG extends Documento {

	@Override
	public void abrir() {
		System.out.println("Implementacion de abrir un png");
	}
	
	@Override
	public void guardar() {
		System.out.println("Implementacion de guardar un png");
		
	}

	@Override
	public void cerrar() {
		System.out.println("Implementacion de cerrar un png");
		
	}
}