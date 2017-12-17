/*Nombre de archivo: Constructor.java
Sirven para inicializar los objetos al ser creados. Tienen siempre el mismo
nombre que su clase y es sintacticamente similar a un metodo aun que no tienen
returntype (ni void).
Se aprovechan para dar valores iniciales a las instance variables definidas en
la clase o para realizar procedimientos de puesta en marcha requeridos por el 
"nacimiento" de cada objt.
Todas las clases tienen constructores aun que no las llegues a definir porque
Java construye en este caso una automaticamente con todas las member variables a0 por defecto.
*/
public class Constructor{
	int x,y;
	String nombre;

	Constructor(int x, int igriega, String name){ //PARAMETRIZADO
	//Fijarse que no hacen falta poner ni los modifiers
		this.x = x;	
		y = igriega;
		nombre = name;

	//USAMOS this. para diferenciar entre la varibale local int x
	//propia del metodo-constructor y la instance variable de clase x
	//en el resto de argumentos no requerimos esto ya que son distintas.
	}

	public void printear(){ //metodo para hacer display 
	
		System.out.println("("+this.x+","+this.y+")"+"->"+this.nombre);
		/*
		 *Fijarse que en este caso uso this para hacer referencia
 		 *y acceder a las instance variables del objeto desde el cual
		 *llamo a este metodo. Podria pensar en hacer una funcion
		 *tipo printear(obj1) que me hiciera display de sus variables
		 *pero no seria la forma correcta de hacerlo.
		 */	
	}

	public static void printearMax(double... numeros){
	/*
	 *Los argumentos de un metodo permiten ser de tamaño variable con ...
	 *siempre que sean de un mismo tipo donde seran guardados en el array
	 *con nombre o refvar dado. En este caso, numeros.
	 */
	
		if (numeros.length == 0){
			System.out.println("No se ha pasado ningun argumento!");
			return;
		}
		
		double maximo = numeros[0];

		for(double elemento:numeros){
			maximo = (elemento>maximo) ? elemento : maximo;
		}
		System.out.println(maximo);
	}	

	public static void main(String[] args){

	Constructor p1 = new Constructor(1,2,"p1");
	Constructor p2 = new Constructor(3,4,"p2");


	p1.printear();p2.printear();
	printearMax(new double[]{2.4,2.1,5.1,3.5,4.1});

	}

//protected void finalize(){BLOQUE CODIGO} se puede usar para realizar
//las instrucciones dadas antes de que el objeto sea destruido por el 
//garbage collector.

	//EJ: asegurarse que un archivo abierto se cierre cuando lo usa un obj.

}
