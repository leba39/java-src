/*Nombre de archivo: BancoDemo.java*/

public class BancoDemo{

	//EJEMPLO DONDE USO ExcepPropia.java y CuentaBanco.java
	public static void main(String[] args){

		CuentaBanco mi_cuenta = new CuentaBanco(1);
		System.out.println("Cuenta creada satisfactoriamente");

		System.out.println("Depositando 100.25€...");
		mi_cuenta.deposito(100.25);

		//EMPIEZA EL BLOQUE TRY/CATCH YA QUE AL RETIRAR ES DONDE PUEDEN
		//SURGIR EXCEPCIONES

		try{
			System.out.println("Retirando 50€");
			mi_cuenta.retirar((double)50); //pruebo un cast FUNCIONA
			System.out.println("Balance:\t"
			+ mi_cuenta.obtBalance() + " €");
			
			System.out.println("Retirando 500€");
			mi_cuenta.retirar((500.0));
			System.out.println("Balance:\t"
			+ mi_cuenta.obtBalance() + " €");
		}catch (ExcepPropia e){
			System.out.println("No tiene saldo suficiente, le falta:\t" +
			e.faltaMontante() + " €");
		}finally{
			System.out.println("Balance Final:\t"
			+ mi_cuenta.obtBalance() + " €");
		}
	}

}
