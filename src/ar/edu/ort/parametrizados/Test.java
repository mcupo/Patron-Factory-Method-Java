package ar.edu.ort.parametrizados;

public class Test {

	public static void main(String[] args) {
		
	    Aplicacion appDibujo = new AplicacionDibujo();
	    Documento dibujoJpg = appDibujo.nuevoDocumento("jpg");
	    
	    dibujoJpg.guardar();
	    dibujoJpg.cerrar();
	}
}