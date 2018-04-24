package ar.edu.ort.parametrizados;

public class Creador {
	
	public Documento Crear(String idProducto) {
		if (idProducto == "Texto") 	return new DocumentoTexto();
		if (idProducto == "Dibujo") return new DocumentoDibujo();
		//...
		return null;
	}
}
