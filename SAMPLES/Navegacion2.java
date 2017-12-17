/*Nombre de archivo: Navegacion.java*/
import java.io.File; //Clases necesarias para crear directorios, mostrarlos etc

public class Navegacion2{
	
	/*	 Navegacion y creacion de directorios:
	 *Lo podemos hacer a través de la clase File. Esta contiene metodos para
	 *crear carpetas, renombrar, mostrar archivos en determinado directorio.
	 *En este ejemplo nos centramos en mkdir, mkdirs y list()
	 */
	public static void main(String[] args){
		//mkdir crea el directorio dado. devuelve true en caso de exito
		//mkdirs crea el directorio y los superdirectorios necesarios.
		//list() devuelve un array de strings con la lista de archivos

		File pwd = null; //declaracion
		String lista[];

		try{
			String directorio = 
			"/home/abel1/Escritorio/CODIGO/JAVA/PRACTICA/thinkjava";
			pwd = new File(directorio);

			lista = pwd.list();

			//printeamos la lista con un FOR ENHANCED
			for(String elemento:lista){
				System.out.println(elemento);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
