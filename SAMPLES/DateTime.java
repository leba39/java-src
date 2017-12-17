/*Nombre de archivo: DateTime.java*/
import java.util.Date; //importamos las clases necesarias
import java.text.*;    //para el formateo de date
import java.util.*;    //para sleep, threads y demas
public class DateTime{

	public static void main(String[] args){
	/*
	 *CONSTRUCTOR DATE. -> devuelve la fecha y hora actual
	 *Metodos de la clase DATE:
	 *boolean dateobj.after/before(Date date)
	 *boolean dateobj.equals(objdate)
	 *object dateobj.clone()
	 *int dateobj.compareTo(Date date) -> 0=Igual,<0Menor que date,>0...
	 *long dateobj.getTime() -> devuelve el numero de milisegundos desde EPOCH
	 *String dateobj.toString() -> convierte el obt en string y devuelve
	 */

	Date fecha = new Date();
	Date epoch = new Date();
	String nombre = "Abel";
	long miliseg;
	
	miliseg = epoch.getTime();	
	System.out.println(fecha.toString());
	System.out.println(miliseg);

		//FORMATEO DE DATE
	//Con SimpleDateFormat -> clase propia -> metodo .format(dateobj)
	SimpleDateFormat formato_deseado = 
	new SimpleDateFormat("E yyyy.MM.dd");
		//Existen un monton de codigos para otras representaciones
		// c->fecha completa F->fecha ISO T->24h...
	System.out.println(formato_deseado.format(fecha));

	//Con printf -> muy facil, solo se usa %t con el codigo deseado
			//%tm mes del año
	System.out.printf("Estamos en el mes %tm del año %ty.\n"
			 ,fecha,fecha,fecha);

	System.out.printf("Estamos en el mes %1$tm del año %1$tY, %2$s.\n"
			 ,fecha,nombre);
	//NOTA: Podemos referirnos a un mismo argumento formateando con printf
	//	si ponemos x$ justo despues de % siendo x el indice del arg.
	
		//SLEEP, CURRENTTIMEMILLIS
	try{
			
		Date inicio_fecha = new Date();
		long inicio = System.currentTimeMillis();
		long inicio_1 = inicio_fecha.getTime();
		
		inicio_1 = inicio_fecha.getTime();
		System.out.println(new Date());
		Thread.sleep(1000); //1 seg
		System.out.println(new Date());
		
		Date fin_fecha = new Date();
		long fin_1 = fin_fecha.getTime();
		long fin = System.currentTimeMillis();
		long dif = fin - inicio; //tendra que ser 1 segundo
		long dif_1 = fin_1 - inicio_1; 
		//tendra que dar lo mismo, es otra forma valida de hacer lo
		//mismo pero con dateobjts y getTime()
		
	
		System.out.println("Diferencia:\t"+dif);
		System.out.println("Diferencia:\t"+dif_1);

		
	}catch (Exception e){
		System.out.println("Error");
	}
	
	}
}
