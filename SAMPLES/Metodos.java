/*Nombre de archivo: Metodos.java*/

public class Metodos{
	//Modificador TipoRetorno Metodo (Argumentos){}
		//Modificador -> public static, private, protected ...
		//TipoRetorno nulo -> void.

	/* Metodo OVERLOADING (NO CONFUNDIR CON OVERRIDING):
		Sucede cuando dos o mas metodos tienen el mismo nombre
		pero distintos parametros -argumentos c/s retorno-

		Overriding es cuando el metodo es exactamente el mismo
	*/

	public static int suma(int num1, int num2){
		return (num1+num2);
	}
	public static double suma(double num1, double num2){
		return (num1+num2);
	}
	public static int minimo(int num1, int num2){
		int min;
		min = (num1<=num2) ? num1 : num2;
		return min;
	}
	public static double minimo(double n1, double n2){
		double min;
		min = (n1<=n2) ? n1 : n2;
		return min;
	}

	//MAIN
	public static void main(String[] args){

	int n1 = 5, n2 = 10;
	double e = 2.36, pi = 3.14;

	System.out.println(suma(n1,n2));	//podria meterlos primero
	System.out.println(suma(e,pi));		//en una variable y printear
	System.out.println(minimo(n1,n2));	//esta para remarcar que 
	System.out.println(minimo(e,pi));	//retornan valores pero es =

		//ARGUMENTOS POR CONSOLA -> LOS ARGUMENTOS DE MAIN
	//Los tenemos como un array de strings

	for (String argumento : args){
		System.out.println(argumento);
	}
	//for (int i = 0; i<args.length;i++{printf("%s",args[i]);}) EQUIVALENTE


	}
}
