package ar.edu.ort.parametrizados;

public class DocumentoDibujoJPG extends Documento {
	
	@Override
	public void abrir() {
		System.out.println("Implementacion de abrir un jpg");
	}
	
	@Override
	public void guardar() {
		System.out.println("Implementacion de guardar un jpg");
		
	}

	@Override
	public void cerrar() {
		System.out.println("Implementacion de cerrar un jpg");
		
	}

}
