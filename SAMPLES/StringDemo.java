public class StringDemo{
	
	/*
	 *Cadenas de texto -> " ". La forma mas directa el string literal a un
	 *objeto de la clase String (lo que estuvimos haciendo hasta ahora)
	 *pero como con cualquier otra nueva instancia de objeto tambien podemos	  *usar el constructor.
	 *
	 */
	public static void main(String []args){

		String saludo_1 = "Hola Abel!";
		char saludoarray[] = {'H','o','l','a',' ','A','b','e','l','!'};
		String saludo_2 = new String(saludoarray); 
		//le mando el array char. La clase String tiene hasta 11 
		//constructores que permiten usar distintas sources como valor
			
			//prueba
		System.out.println(saludo_1);
		System.out.println(saludo_2);

			//METODOS DE ACCESO.
		//Son aquellos que obtienen informacion sobre el objeto al que
		//acompañan. EJ:
				//length() ->retorna int
		int len = saludo_1.length();

		System.out.printf("Saludo2 tiene %d caracteres.\n",len);

				//string1.concat(string2) -> como usar +
		System.out.println(saludo_1.concat(" Que tal?"));
		
		//TAMBIEN SE PUEDEN CREAR STRINGS PRE-FORMATEADAS CON
				//format() -> como printf en C
		String formateado;
		formateado = String.format("Saludo_1 contiene:\t%s\n" +
					   "Eso son:\t%d "+"caracteres."
					   ,saludo_1,len);

		System.out.println(formateado);
			//ahora lo uso cuando quiera invocando el nombre objt.

		//MAS METODOS:

			//char charAt(int index) ->autoexplicativo
		String regla = "Los Strings son inmutables.";
		char primera_letra = regla.charAt(0);
		
			//int compareTo(objt) -> 0IGUAL,<0 MAYOR,>0 MENOR
			//str.compareTo(str)
		String regla_2 = "Los enteros no son inmutables.";
		System.out.println(regla.compareTo(regla_2)); // >0
			
			//int compareToIgnoreCase(str)
		//como la anterior pero ignorando mayus y minus
		String regla_3 = "LOS STRINGS SON INMUTABLES.";
		System.out.println(regla.compareToIgnoreCase(regla_3)); //=0

			//boolean Stringobj.contentEquals(StringBuffer)
			//boolean Stringobj.endsWith("string")
			//boolean Stringobj.equals(obj)
			//int Stringobj.indexOf(char) -> primera ocurrencia
		System.out.println(regla.indexOf('L')); //0
		
			//String obj.replace(oldchar,newchar) - >todas ocurrencias
		System.out.println(regla.replace('o','a'));

			//String[] stringobj.split("String reg.expr.")
		//devuelve un array de strings. tantos cachos como ocurrencias
		//que se den segun la expresion regular

		for (String cachos : regla_3.split(" ")){
			System.out.println(cachos);
		//el argumento a split con "". REGEXP!
		}
			
			//String stringobj.substring(indice)
		//devuelve la substring comenzando por el indice dado

			//char[] stringobj.toCharArray() -> autoexplicativo
			//String stringobj.trim() 
		//recorta el whitespace de la string al principio y al final
		
			//String.valueOf(varType var)
		//devuelve la representacion en string de lo dado

		boolean b = true;
		System.out.println(String.valueOf(b)); //true
		System.out.println(String.valueOf(saludoarray));

			//String stringobj.copyValueOf(char[])		

	/*
			EL ERROR : 
		   INCOMPATIBLE TYPES: JAVA.LANG.STRING cannot be converted 
		   to String
		   Era por que habia llamado a esta clase y fichero String
	           y habia conflicto entre los dos al estar en el mismo package!
	
	 */

	}

}
