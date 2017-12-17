/*Nombre de archivo: ExcepPropia.java*/
import java.lang.Exception; //clase
import java.io.*;

public class ExcepPropia extends Exception{

	/*	CREAR EXCEPCIONES PROPIAS:
	 *Podemos crearlas siempre que las hagamos hijas de Throwable. Si 
	 *queremos crear una CHECKED excep. (compiletime) tenemos que extender
	 *la clase Exception y si queremos crear una UNCHECKED excep. (runtime)
	 *tenemos que extender la clase RuntimeException
	 */

	private double cantidad; //instance variable

	public ExcepPropia(double cantidad){	//CONSTRUCTOR
		this.cantidad=cantidad; 
	//uso de this para diferenciar entre var local y instance var
	}
	public double faltaMontante(){ 
		//metodo retorno. ES UN METODO PROPIO DE LA EXCEPCION!
		return cantidad;
	}

}
