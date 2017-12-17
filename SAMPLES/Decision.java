public class Decision{

	public static void main(String []args){

	/*
	 *Prueba de control de flujo-decisiones. IF, ELSE, 'nested', SWITCH
	 *Como en C.
	 */

		int x = 10;
		char nota = 'C'; //Usar '' y no " "!! Igual que en C.

		if (x==20){
			System.out.println("Prueba if.");
		}
		else if (x>20){
			System.out.println("Prueba else-if.");
		}
		else{
			System.out.println("Prueba else.");
			if (x==10){
				System.out.println("El valor de x es 10.");
			}
		}
		
		switch(nota) {
			case 'A':
				System.out.println("Excelente!");
				break;
			case 'B':
				System.out.println("Notable!");
				break;
			case 'C':
				System.out.println("Suficiente!");
				break;
			default:
				System.out.println("Nota invalida!");
		
		}
		/*
		 *La variable que switcheamos tiene que ser un numero o una
		 *variable que pueda ser convertida en tal (byte,shor,char)
		 *strings o enums.
		 */
		nota = 'F';
		String resultado = nota == 'F' ? "Suspendiste!":"Aprobaste!";
		//Operador ternario exp1 ? exp2:exp3 si exp1 True->exp2	
		System.out.println(resultado);
	}
}
