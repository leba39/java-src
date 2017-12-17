/*Nombre de archivo: IOStreams.java*/
import java.io.*; //Paquete con las clases necesarias para realizar IO.

public class IOStreams{

	/*
	 *InputStream y OutputStream son clases mas generales que las hasta
	 *ahora vistas. Así, podemos instanciar objetos de esta como
	 *FileInputStream o FileOutputStream que ya tocamos. A estas ultimas
	 *de la misma manera tambien podemos pasarle un objeto File previo.
	 */
	
	public static void main(String[] args) throws IOException{

		File texto = new File("holacopia3.txt");

		OutputStream salida = null; //DECLARAMOS

		try{
			byte numeros[] = {1,2,3,4,5};
			salida = new FileOutputStream(texto);
				
			for(int i = 0; i < numeros.length;i++){
				salida.write(numeros[i]);
			}
			salida.close();
				
			InputStream entrada = new FileInputStream("holacopia3.txt");
			int hueco = entrada.available(); //Cuantos bytes quedan por leer
			int c;
			for (int j = 0; j < hueco;j++){
				c = entrada.read(); //cast
				System.out.println(c);
			}
			entrada.close(); //NO OLVIDARSE DE CERRAR!		

		}catch (IOException e){
			System.out.println("Hubo un error!");
		}	

	/* FALLO: tenia char c y luego un c = entrada.read() con cast a char
		  previo. necesitaba quitar el cast o cambiar de typevar.

	*/
	}

}
