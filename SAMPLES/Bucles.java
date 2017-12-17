public class Bucles{
	/*
	 *Distintos bucles en Java -> Se usan como en C
	 *for (inicializacion;expresion;update){}
	 *while (expresion){}
	 *do{//bloque}while(expresion);
	 *A partir de JAVA 5 se permite el uso de loops FOR mejorados
	 *o 'enhanced'. Normalmente usados para atravesar una coleccion
	 *de elementos de un array se usan asi.
	 * for (declaracion : expresion){}
	 */
	public static void main(String []args){
	
		int x,y,z; 
	
		x = 0;	
		while (x<20){
			System.out.println("Valor de x:\t" + x + "\n");
			x++;
		}
		for (y=20;y<40;y+=1){
			System.out.println("Valor de y:\t" + y + "\n");
		}
		z = y;
		do{
			System.out.println("Valor de z:" + z + "\n");	
			z++;
		}while(z<50);

		//'enhanced' for loops.
		int numeros[]    = {10,20,30,40,50};
		String nombres[] = {"Abel","Dani"};

		for (int k : numeros){
			System.out.println(k + "\n");

		}
		for (String nome : nombres){
			System.out.println(nome + "\n");

		}
	
		//Los arrays se pueden crear int n[]; o int [] n;
	}

}
