class Vehiculo{}

public class Coche extends Vehiculo{

	public static void main(String []args){
	
		boolean resultado1,resultado2;
		String modelo = "Suzuki";
		Vehiculo mi_coche = new Coche();
	
		resultado1 = modelo instanceof String;
		resultado2 = mi_coche instanceof Coche;

		System.out.println(resultado1);
		System.out.println(resultado2);
		
		}	
}

