/*Nombre de archivo: CuentaBanco.java*/
import java.io.*; //importamos clases de paquete

public class CuentaBanco{
	//HAREMOS USO DE NUESTRA RECIEN CREADA EXCEPCION
		
		//instance variables
	private double saldo = 0; 
	private int numero_cc;

	//CONSTRUCTOR
	public CuentaBanco(int num){
		numero_cc = num;
	}
	//METODOS
	public void deposito(double tanto){
		saldo += tanto;
	}
	public double obtBalance(){
		return saldo;
	}
	public int numeroCuenta(){
		return numero_cc;
	}
	public void retirar(double tanto) throws ExcepPropia{
		if (tanto <= saldo){
			saldo -= tanto;
		}else{
			double falta = tanto - saldo;
			throw new ExcepPropia(falta);
		}
	}
}
/*SI UN METODO NO TRATA UNA CHECKED EXCEP (compiletime), ES DECIR, NO LA MANEJA
DEBIDAMENTE, DEBE DECLARARLA CON 'throws'. ESTO APARECE AL FINAL DE
LA FIRMA DEL METODO ACOMPAÑADO DE UNA O VARIAS EXCEPCIONES. PUEDES INSTANCIAR
UNA NUEVA EXCEPCION O LANZAR UNA QUE TIENES EN CATCH.*/
