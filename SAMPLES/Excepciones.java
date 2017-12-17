/*Nombre de archivo: Excepciones.java*/
import java.lang.Exception; //clase

public class Excepciones{

	/*EXCEPCIONES:
	 *Ocurren cuando el transcurso del programa es interrumpido y la app
	 *termina anormalmente. Se deben manejar y tratar.
	 *Existen por muchas razones distintas, por ejemplo. El usuario ha
	 *introducido data no valida, un archivo a abrir no es encontrado, una
	 *conexion se ha perdido en el medio de la comunicacion(transferencia) o
	 *la JVM se ha quedad sin memoria.
	 *
	 *Las excepciones en Java se dividen en dos grandes grupos, CHECKED Exc
	 *(ocurren al compilar, dando fallo) por ejemplo, al abrir un archivo
	 *inexistente la FileNotFoundException. Las UNCHECKED Exc ocurren durante
	 *la ejecucion (RunTime), por ejemplo, al intentar acceder al 3er elemento
	 *de un int[2] ocurrirá una ArrayIndexOutOfBoundsException.
	 *
	 *Todas las excepciones son subclases de java.lang.Exception y estas de
	 *Throwable. (esta tmb contiene Errors, que son dados por JVM y no se
	 *pueden tratar)
	 *
	 *Los metodos mas comunes disponibles para las excepciones son:
	 *String excobj.getMessage(), .getCause() y .printStackTrace()
	 *
	 *Para manejar excepciones usamos el bloque TRY/CATCH(excep)/FINALLY
	 *Este ultimo bloque siempre se ejecuta. Podemos tener tantos Catch como
	 *querramos.
	 */

	public static void main(String[] args){
		//EJEMPLO SENCILLO	
		try{
			
			int a[] = {1,2};
			for (int i=0; i<3;i++){
				System.out.println(a[i]); //va a fallar en a[2]
			}
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Excepcion:\t"+e);
			e.printStackTrace();
		}finally{
			System.out.println("FIN!");
		}
	}

}
