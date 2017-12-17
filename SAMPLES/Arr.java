/* Nombre de archivo: Arr.java*/
public class Arr{
	
	//EJs DECLARACION, INICIALIZACION, RECORRIDO POR BUCLES ETC

	public static void main(String[] args){

		//Podemos declararlos de distintos modos
		int[] numeros;
		int numeros_1[];
		//Tambien usando el constructor. Mas rebuscado. Menos simple.
		int[] numeros_2 = new int[5];
		//Podemos definir y declarar en la misma linea como en C.
		int[] numeros_3 = {1,2,3,4,5}; //5 elementos
		int numeros_4[] = {1,2,3,4,5}; //crea array de 5 automaticamente

		//SI QUIERO DECLARAR ARRAY LO HAGO [] LIBRE, SI LO QUIERO 
		//DECLARAR DE 'X' TAMAÑO -> int x[] = new int[TAMAÑO]
		//SI DECLARO Y DEFINO AL MISMO TIEMPO NO TENGO POR QUE PONER
		//EL TAMAÑO SI NO QUE SE CREA AUTOMATICAMENTE.
		//int x[] = {1,2} serra un array de [2].

		//RECORRIDO POR BUCLES FOR Y ENHANCED FOR

			//print , suma y max
		int suma = 0;
		int maximo = numeros_4[0];
		for (int i=0;i<numeros_4.length;i++){

			System.out.println(numeros_4[i]);
			suma += numeros_4[i];
			if (numeros_4[i] > maximo) maximo=numeros_4[i];
				//misma linea es aceptable

		//suma no la hago dentro del bucle para que no sea local y la
		//pueda ver desde fuera cuando acaben las iteracciones.
		//la declaracion&definicion del contador lo puedo hacer dentro
		//del los argumentos del FOR como tambien se permite en C
		}
		int minimo = numeros_4[0];
		for (int elemento : numeros_4){

			if (minimo>elemento) minimo=elemento;
		}
		
		System.out.println("Suma total es:\t"+suma);
		System.out.println("Maximo total es:\t"+maximo);
		System.out.println("Minimo total es:\t"+minimo);

		double[] decimales = {13.4,21.5,3.14,2.2};

		for (double decimal : decimales){
			System.out.println(decimal);
		}

		int reverso[];
		reverso = reves(numeros_4);
		for (int elemento : reverso){
			System.out.println(elemento);
		}


		//METODOS PROPIOS DE LA CLASE ARRAY
	
	//public static void sort(Object[] a)->orden ascendente. primitive data
	//public static void fill(int[] a, int val)->rellena [] con el val
	//public static boolean equals(long[] a,long[] a2)->True si son obj/val ==
	//public static int binarySearch(Object[] a, Object key)
		//busca el valor dado por key en []. para eso el array tiene que
		//estar ordenado previamente (sort).

	}
	//LENGTH SE APLICA A ARRAYS SIN (). DIFERENCIA CON EL String method!!

	/* Pasando y devolviendo arrays a metodos propios*/

	public static int[] reves(int lista[]){
		//Como argumento pide un array de ints y retorna otro.
		//aprovechamos el ejemplo para ver un for con varias
		//inicializaciones y variables de paso-recorrido.

		int resultado[] = new int[lista.length];
		//No puedo usar int resultado[lista.length]; MAL! OJO!



		for (int i = 0, j = lista.length-1;i<lista.length;i++,j--){
			resultado[j] = lista[i];
		}

		return resultado;
	}
	
}
