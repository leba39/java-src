/*Nombre de archivo: CopiaArchivo.java*/
import java.io.*; //Este Paquete contiene las clases necesarias para I/O.
		  
public class CopiaArchivo2{
	/*	
	 *Un stream se define como una secuencia de data y los hay de dos tipos.
 	 *InPutStream en donde leemos data desde una source.
	 *OutPutStream en donde escribimos data a cierto destino.
	 */
	public static void main(String[] args) throws IOException{

	/* 	CHARACTER STREAMS
	 *Estros streams operan bajo paquetes de 2 bytes (16). Las clases mas
	 *usadas son FileReader y FileWriter. 
	 *(internamente Usan FileInputStream y FileOutputStream)
	 */

		FileReader entrada = null; //recordar que siempre podemos
		FileWriter salida = null;	//declarar objts a null

		try{
			//Es ahora cuando los definimos.
			entrada = new FileReader("holacopia.txt");
			salida = new FileWriter("holacopia2.txt");
			//dentro del bloque try por si falla.
	
			//leemos hasta fin de fichero (read devuelve -1)
			int c;
			char ae = '\u00C6'; //UNICODE PARA AE LATINO
			while ((c = entrada.read()) != -1){
				salida.write(c);
				//PRUEBA: CHARACTER STREAM CAPAZ DE UNICODE?
				salida.write(ae);
				//y escribimos a salida
			}

		}catch (IOException e){
			System.out.println("Hubo un error");
		}finally{
			if (entrada != null){
				entrada.close();
			}
			if (salida != null){
				salida.close();
			}
			//Si los archivos fueron abiertos cerrarlos.
		}
	

	//NOTAS: NECESITABA DECLARAR LA EXCEPCION CON EL THROW PARA EL CATCH.

	}
}	
