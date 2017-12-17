/*Nombre de archivo: CopiaArchivo.java*/
import java.io.*; //Este Paquete contiene las clases necesarias para I/O.
		  
public class CopiaArchivo{
	/*	
	 *Un stream se define como una secuencia de data y los hay de dos tipos.
 	 *InPutStream en donde leemos data desde una source.
	 *OutPutStream en donde escribimos data a cierto destino.
	 */
	public static void main(String[] args) throws IOException{

	/* 	BYTE STREAMS
	 *Estros streams operan bajo paquetes de 8bits bytes. Las clases mas
	 *usadas son FileInputStream y FileOutputStream
	 */

		FileInputStream entrada = null; //recordar que siempre podemos
		FileOutputStream salida = null;	//declarar objts a null

		try{
			//Es ahora cuando los definimos.
			entrada = new FileInputStream("hola.txt");
			salida = new FileOutputStream("holacopia.txt");
			//dentro del bloque try por si falla.
	
			//leemos hasta fin de fichero (read devuelve -1)
			int c;
			while ((c = entrada.read()) != -1){
				salida.write(c);
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
