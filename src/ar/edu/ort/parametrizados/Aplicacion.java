package ar.edu.ort.parametrizados;

//Clase Creador
public abstract class Aplicacion {

	public abstract Documento FabricarDocumento(String tipo);//Metodo de fabricacion
	
	public Documento nuevoDocumento(String tipo) {
		Documento doc = FabricarDocumento(tipo);
		doc.setNombre("Documento sin guardar");
		//...aca irian todas las operaciones que se hacen sobre el documento para finalizar su creacion
		return doc;
	}
}
