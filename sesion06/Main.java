import java.lang.*;
import java.util.*;

public class Main{
	public static void main (String [] args){
		Calculadora cal1= new Calculadora(0);

		cal1.suma(10,4);
		System.out.println("Suma: "+cal1.getResultado());

		cal1.resta(10,5);
		System.out.println("Resta: "+cal1.getResultado());

		try{
			System.out.println("Division: "+cal1.division(20,0));
		} catch (ArithmeticException e){
			System.out.println("Error: "+e.toString());
		}

		CalculadoraFrame ventana1= new CalculadoraFrame();
		ventana1.setVisible(true);
	}
}