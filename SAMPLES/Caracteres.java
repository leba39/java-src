public class Caracteres{

	public static void main(String []args){
	
	/*
	 *Normalmente cuando trabajamos con caracteres usamos char de tipo
	 *primitivo pero cuando necesitamos usarlos como objetos tenemos
	 *que acudir a la clase Character (wrapper). Esta proviene de una 
	 *lista de metodos para la manipulacion y/o verificacion de carctrs.
	 
	 *Algunas veces el compilador de Java puede hacer el wrappeado
	 *automaticamente, por ejemplo si le paso un data primitive a un 
	 *metodo que espera un objecto (autoboxing).	 
	 */
		char ch    = 'a'; //no usar " " -> strings
		char unich = '\u039A'; //OMEGA
		char charray[] = {'a','b'};
		char nlinea    = '\n'; //secuencia de escape
		Character obj1 = new Character('2'); //boxing
		Character obj2 = 'z'; //autoboxing



		System.out.println("Hola!"+nlinea+"\"Abel\".");

			//METODOS

		//isLetter(), isDigit(), isWhitespace(), isUpperCase()...

		//Devuelven un boolean y aceptan caracter data primitiva
		//tambien aceptan objeto Character.

		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit(obj1));
		System.out.println(Character.isLetter(obj2));
		System.out.println(Character.isWhitespace(nlinea));
			//tabuladores, ' ', y retornos son whitespace

		//toUpperCase(), toLowerCase()
		
		//Devuelven un char y aceptan char primitivo o objeto

		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.toUpperCase(obj2));


		//toString()

		//Devuelve un objeto STRING dado un char primitivo u objeto.
		//Es por esto que los strings siempre los declaramos con Mayus		      //es por que en verdad los hacemos Objetos de la clase String
		//igual que hicimos con Number y con Character

		System.out.println(Character.toString(ch));
		System.out.println(Character.toString(obj1));
		
		String amas2 = Character.toString(ch) + Character.toString(obj1);
		System.out.println(amas2);

		
	
	}

}
