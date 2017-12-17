import java.io.*; //Importamos todas las clases disponibles en java/io/

public class Empleado{
	//SOLO DEFINIMOS LA CLASE. EL MAIN LO HACEMOS DESDE OTRO SRC.

	/*
 	 *Podemos hacer las variables publicas o privadas. Si publica, esta
	 *será visible para cualquier subclase de esta; si privada, solo será
	 *visible para la clase empleado.
	 */

	static int empleados=0; //Variable de clase. Estatica.
	/*Se puede asignar valores a esta en su declaracion,en el constructor
	 *(como hacemos mas abajo cuando)o en bloques especiales staticos
 	 *como MAIN.
	 *Desde el main las podemos llamar por el nombre directamente o 
	 *cambiarlas de valor pero si las llamamos desde otra clase tendriamos
	 *que poner el nombre de esta delante. 
 	 * EJ: Empleado.EMPRESA
	 */

	public static final String EMPRESA = "Altia";
	//Normalmente las var. staticas se suelen usar para constantes (final)	

	String nombre;		//Instance variables.
	int edad;
	String destino;
	double salario;

	//Constructor
	public Empleado(String nome){
		this.nombre=nome;
		empleados += 1;
	}
	
	//Metodos
	public void setEdad(int idade){
		edad = idade;
	}
	public void setDestino(String loc){
		destino = loc;
	}
	public void setSalario(double sueldo){
		salario = sueldo;
	}

	public void datosEmpleado(){
		System.out.println("Nombre:\t" + nombre);
		System.out.println("Edad:\t" + edad);
		System.out.println("Destino:\t" + destino);
		System.out.println("Salario:\t" + salario);
		/*
		 *Fijarse en que no hay que hacer ningun cast para imprimir
		 *ints, doubles concatenados a una string y que no hace
		 *falta llamar a this.nombre etc ya que al ser instance
    		 *variables ya son propias/unicas de por si.		 
		 */
		
	}

}
