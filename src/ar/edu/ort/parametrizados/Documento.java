package ar.edu.ort.parametrizados;

public abstract class Documento {

	public String nombre;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void abrir();
	
	public abstract void guardar();
	
	public abstract void cerrar();
	
}
