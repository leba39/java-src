public class StringDemo2{

	
	public static void main(String []args){

		String regla = "Las strings son inmutables!";
		/*
	   	 *Una vez creado el objeto-string este no puede ser cambiado
		 *Si hay una necesidad para modificarlo es mejor usar strings
		 *de la clase StringBuffer y StringBuilder.
		 *Los objetos de estas se pueden asi appendear, reverse ...
		 */


			//EJEMPLO	
		StringBuffer sb = new StringBuffer("Hola!");
		StringBuffer sb_1 = new StringBuffer("Que tal!");
		String nombre = " Abel";
	
		sb.append(nombre);
		System.out.println(sb);
		System.out.println(sb_1);

			//METODOS PROPIOS

		//StrBuffer strbffobj.append(stringobj)
		//StrBuffer strbffobj.reverse()
		//StrBuffer strbffobj.delete(indiceI,indiceF)
		//StrBuffer strbffobj.replace(ind I, ind F, stringobj)
		//StrBuffer strbffobj.insert(indice, varType)

		sb_1.append("Cuanto tiempo!");
		System.out.println(sb_1);
		sb_1.reverse();
		System.out.println(sb_1);
		sb_1.delete(0,1);
		System.out.println(sb_1);
		sb_1.replace(0,6,nombre);
		System.out.println(sb_1);
		
		double pi = 3.14;
		sb_1.insert(0,pi);
		System.out.println(sb_1);
	

		/*
		NO SE PUEDE HACER AUTOBOXING COMO CON Strings.
		SIEMPRE HAY QUE USAR EL CONSTRUCTOR PARA StringBuffer
		 */
	}

}
