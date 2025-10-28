import java.lang.*;
import java.util.*;

public abstract class Operaciones{
	protected double resultado;

	public Operaciones(){
	}	
	
	public double getResultado(){
		return resultado;
	}
	public void setResultado(double resultado){
		this.resultado=resultado;
	}

	public abstract void suma (double num1, double num2);
	public abstract void resta (double num1, double num2);
	public abstract void multiplicar(double num1, double num2);

	public void division(double num1, double num2){
		this.resultado= num1/num2;
	}
}