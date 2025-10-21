import java.lang.*;
import java.util.*;

public class Persona{
	protected String nombre;
	private int edad;
	private char sexo;

	public Persona(String nombre, int edad, char sexo){
		this.nombre= nombre;
		this.edad= edad;
		this.sexo= sexo;
	}

	public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String obtenerDatos (){
        String cadena= "#### Persona ####" + 
        "\nNombre: "+this.nombre+ 
        "\nEdad: "+this.edad+ 
        "\nSexo: "+this.sexo;
        return cadena;
    }
}