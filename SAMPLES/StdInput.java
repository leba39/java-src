/*Nombre de archivo: StdInput.java*/
import java.io.*;	//Paquete necesario con clases para IO.

public class StdInput{
	
	/*
	 *Los tres streams de entrada estandars que hay tambien en C
	 *STDIN, STDOUT,STDERR se convierten en java en System.in,
	 *System.out y System.err
	 */
	public static void main(String []args) throws IOException{
		//EJEMPLO: LEER DESDE STDIN HASTA QUE SE RECIBA UNA 'Q'
		//Usaremos la clase InputStreamReader

		InputStreamReader entrada_consola = null; //declaramos

		try{
			entrada_consola = new InputStreamReader(System.in);
			//instanciamos-creamos objeto con stream STDIN
			System.out.println("Meta caracteres, 'q' para salir");
		
			char c;
			do{
				c = (char )entrada_consola.read();
				//hacemos cast para meterlo en el char c
				System.out.println(c);

			}while(c != 'q');


		}finally{
			if (entrada_consola != null) entrada_consola.close();
			//Si se llego a definir, es decir, abrir; cerrar.
		}
	}
}
