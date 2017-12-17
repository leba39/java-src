public class Can1{

	/*
	 *Clase-Inicializacion-Objeto. Variables de clase, instance
	 *variables y metodos. Constructor.
	 */

	static int canes=0; 	//Variable de clase. Contador.Estatica.General
	int canEdad;		//Instance variable	
	String nome;		//Unicas para cada objeto.	

	//constructor
	public Can1(String nombre){
		System.out.println("Bautizado con:\t" + nombre);
		this.nome = nombre;
		canes = canes + 1;
	}
	
	//metodos
	public void setEdad(int edad){
		canEdad = edad;
	}
	public int getEdad(){
		System.out.println(this.nome+" tiene:\t" + canEdad+ " años.");
		return canEdad;
	}
	
	//MAIN
	public static void main(String []args){
		//CREACION-INICIALIZACION
		Can1 pepa = new Can1("Pepa");
		Can1 blanca = new Can1("Blanca");
		Can1 rita = new Can1("Rita");

		//Calls a metodos
		pepa.setEdad(10);
		blanca.setEdad(6);
		rita.setEdad(3);
		
		//Pruebas
		pepa.getEdad();
		int ageblanca = blanca.getEdad();

	
		System.out.println("Variable ageblanca:\t"+ageblanca);
		System.out.println("De otro modo:\t"+blanca.canEdad);


		//Prueba de variable de clase

		System.out.println("Tengo "+rita.canes+" perros.");
			//Notar como accedo a canes desde rita pero
			//podria hacerlo desde blanca o pepa

	}

}
