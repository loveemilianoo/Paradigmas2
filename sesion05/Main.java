import java.lang.*;
import java.util.*;

public class Main{
	public static void main (String [] args){
		Calculadora cal1= new Calculadora(0);

		cal1.suma(10,4);
		System.out.println("Suma: "+cal1.getResultado());

		cal1.resta(10,5);
		System.out.println("Resta: "+cal1.getResultado());

		cal1.division(25,5);
		System.out.println("Division: "+cal1.getResultado());

		cal1.multiplicar(5,10);
		System.out.println("Multiplicar: "+cal1.getResultado());
		//System.out.println("Suma: "cal1.resta(10,3));
		//Operaciones oper= new Operaciones();
	}
}