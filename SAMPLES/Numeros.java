public class Numeros{

	public static void main(String []args){
	
	/*
	 *Cuando trabajamos con numeros, solemos usar tipos de data primitivos
	 *(int, long, double etc) pero hay situaciones en donde tenemos que
	 *estas variables como objetos; para esto Java permite wrapper clases	       *Estas wrapper clases (Integer,Long,Byte,Double etc) son subclases
	 *de la clase abstracta Number.
	 *
	 *El objetivo de esta es contener como objeto su respectivo tipo de 
	 *data (boxing). Podemos usar el nombre de la variable para asignar
	 *nuevos valores de manera natural (unboxing). La superclase Number
	 *esta incluida en java.lang package.
	 *
	 *Para que nos sirve esto? Para poder usar metodos de Numeros sobre
	 *las variables. EJ.
	 */
		Integer x = 5; 	//boxing
		x = x + 10; 	//unboxing  x=15
		Integer y = x;
		Short   z = x.shortValue();
		
		System.out.println(x);

		//METODOS
			//xxxValue()
		System.out.println(x.byteValue());    //valor de x como byte
		System.out.println(x.doubleValue());//valor de x como doble
		System.out.println(x.longValue()); //valor de X como long

			//compareTo()
		System.out.println(x.compareTo(15)); 
		//Devuelve 0 IGUAL
		System.out.println(x.compareTo(10));
		//Devuelve +1 MAYOR
		System.out.println(x.compareTo(20));
		//Devuelve -1 MENOR

			//equals()
		//Devuelve True si los objts son iguales en Valor y tipo data
		System.out.println(x.equals(y)); //True
		System.out.println(x.equals(z)); //Falso
			
			//valueOf()
		Float a  = Float.valueOf("80");
		Double b = Double.valueOf(5);

			//parseInt()
		//Parecido a valueOf pero se puede meter a una variable sin
		//wrappear una clase.
		int c    = Integer.parseInt("9");
		double d = Double.parseDouble("5");
		int e    = Integer.parseInt("444",16);
		//segundo argumenro radix > representacion decimal (10)
		//binaria (2) octal (8) o hexadecimal (16)


			//MODULO MATHS

			//abs()  valor absoluto

		Integer f = -8;
		double g  = -100;

		f = Math.abs(f); 
		g = Math.abs(g); //Se puede aplicar a una var directamente


			//ceil() floor() round () para redondear

			//max() min()
		//Toman dos argumentos (primitive data types) y devuelven

		int h = Math.max(12,15);

			//exp() 
		//toma argumento de tipo double y devuelve lo mismo
		double i = 11.5;

		System.out.println("El valor de e es " + Math.E);
		System.out.printf("exp(%.3f) es %.3f.\n",i,Math.exp(i));
		//printf funciona como en C

			//log() >logaritmo natural. sqrt() funcionan igual
			//sin() cos() tan() etc

			//random
		//sin argumentos, devuelve double [0,1)	
		System.out.println(Math.random());
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);


	}

}
