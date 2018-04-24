package ar.edu.ort.parametrizados;

public class DocumentoDibujoGIF extends Documento {

	@Override
	public void abrir() {
		System.out.println("Implementacion de abrir un gif");
	}

	@Override
	public void guardar() {
		System.out.println("Implementacion de guardar un gif");
		
	}

	@Override
	public void cerrar() {
		System.out.println("Implementacion de cerrar un gif");
		
	}

}