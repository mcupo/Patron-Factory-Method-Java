package ar.edu.ort.parametrizados;

//Clase CreadorConcreto
public class AplicacionDibujo extends Aplicacion {

	@Override
	public Documento FabricarDocumento(String tipo) {
		if (tipo == "jpg") return new DocumentoDibujoJPG();
		if (tipo == "jpg") return new DocumentoDibujoGIF();
		return new DocumentoDibujoPNG();
	}
}