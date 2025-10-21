import java.lang.*;
import java.util.*;

public class Main{
	public static void main (String args []){
		Cliente cl1= new Cliente("pepe", 21, 'M', "CL01", new Cuenta(250, new Tarjeta("12345","4567")));
		/*System.out.println("##### Cliente #####");
		System.out.println("Nombre: "+cl1.getNombre());
		System.out.println("No. de Cliente: "+cl1.getNoCliente());
		System.out.println("Saldo: "+cl1.getCuenta().getSaldo());
		System.out.println("Numero de tarjeta: "+cl1.getCuenta().getTarjeta().getNoTarjeta());*/
		//System.out.println(cl1.obtenerDatos());

		Empleado em1= new Empleado ("Luis", 34, 'M', "EMP01");
		/*System.out.println("##### Empleado #####");
		System.out.println("Nombre: "+em1.getNombre());
		System.out.println("No. de Empleado: "+em1.getNoEmpleado());*/
		//System.out.println(em1.obtenerDatos());

		System.out.println("########## Polimorfismo ##########");
		Persona personas [] = new Persona[3];
		personas[0]= new Persona("Rafa", 19, 'M');
		personas[1]= new Cliente("Leo", 19, 'M', "CL02", new Cuenta (100, new Tarjeta("54321", "5678")));
		personas[2]= new Empleado("Pepe", 20, 'F', "234");

		for (Persona persona : personas){
			System.out.println(persona.obtenerDatos());
		}
	}
}