/*Nombre de archivo: Navegacion.java*/
import java.io.File; //Clases necesarias para crear directorios, mostrarlos etc

public class Navegacion{
	
	/*	 Navegacion y creacion de directorios:
	 *Lo podemos hacer a través de la clase File. Esta contiene metodos para
	 *crear carpetas, renombrar, mostrar archivos en determinado directorio.
	 *En este ejemplo nos centramos en mkdir, mkdirs y list()
	 */
	public static void main(String[] args){
		//mkdir crea el directorio dado. devuelve true en caso de exito
		//mkdirs crea el directorio y los superdirectorios necesarios.
		//list() devuelve un array de strings con la lista de archivos

	String directorio = 
	"/home/abel1/Escritorio/CODIGO/JAVA/PRACTICA/thinkjava/newDir";
	File carpeta = new File(directorio);

	boolean exito;
	exito = carpeta.mkdir();

	if (exito) System.out.println("La operacion se ha realizado:"+exito);

	}

}
