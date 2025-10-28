import java.lang.*;
import java.util.*;

public class Calculadora extends Operaciones{
	public Calculadora (double resultado){
		this.resultado=resultado;
	}

	public void suma (double num1, double num2){
		this.resultado=num1+num2;
	}

	public void resta (double num1, double num2){
		this.resultado= num1-num2;
	}

	public void multiplicar(double num1, double num2){
		this.resultado= num1*num2;
	}
}