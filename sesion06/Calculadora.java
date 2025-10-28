import java.lang.*;
import java.util.*;

public class Calculadora implements Operaciones{
	private double resultado;

	public Calculadora (double resultado){
		this.resultado=resultado;
	}

	public double getResultado(){
		return resultado;
	}
	public void setResultado(double resultado){
		this.resultado=resultado;
	}

	public void suma (double num1, double num2){
		this.resultado=num1+num2;
	}

	public void resta (double num1, double num2){
		this.resultado= num1-num2;
	}

	public void multiplicar(double num1, double num2){
		resultado= num1*num2;
	}

	public int division(int num1, int num2){
		int result=0;
		try{
			result=num1/num2;
		}catch (ArithmeticException e){
			result=-1;
		}
		return result;
	}


}