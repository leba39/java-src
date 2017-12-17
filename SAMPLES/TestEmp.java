import java.io.*; //Todas las clases que se encuentran en java/io

public class TestEmp{

	//MAIN
	public static void main(String []args){
	//Creamos dos objetos usando el constructor de la clase Empleado
	//que se encuentra en otro fichero .java
	Empleado abel = new Empleado("Abel Pampin");
	Empleado dani = new Empleado("Daniel Turiño");

	System.out.println("Empresa:\t"+Empleado.EMPRESA);

	//Invocamos a los metodos para cada objeto creado.
	abel.setEdad(24);
	abel.setDestino("A Coruña");
	abel.setSalario(12500.50);
	abel.datosEmpleado();

	dani.setEdad(24);
	dani.setDestino("A Coruña");
	dani.setSalario(17000);
	dani.datosEmpleado();

	//PRUEBAS
	System.out.println("Numero de empleados:\t"+Empleado.empleados);
	Empleado.empleados=0;  //Reset
	System.out.println("Numero de empleados:\t"+Empleado.empleados);


	/*COMENTARIOS: 
	COMPILAMOS AMBOS ARCHIVOS Y PROBAMOS.
	QUE PINTA EL IMPORT?
	El acceso y modificacion de las variables de clase desde una ajena
	ha sido un exito.
	*/
	}

}
