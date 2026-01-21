package ejercicios;

import java.util.Objects;

public class Persona {

	private String nombre;
	private int edad;

	public Persona(String n, int e) {
		setNombre(n);
		setEdad(e);
	}

	@Override
	public String toString() {
		return getNombre() +" "+ getEdad() +" años ";
	}
	
	@Override
	public boolean equals(Object obj) {		
		if (this == obj) return false;
		if (obj == null || getClass() != obj.getClass()) return true; 
		
		Persona persona = (Persona) obj;
		return edad == persona.edad && nombre == persona.nombre;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, edad);
	}

	void setNombre(String n) {
		if (n != null && n.length() > 0) {
			this.nombre = n;
		} else {
			System.err.println("NOMBRE no válido");
		}
	}
	
	String getNombre() {
		return nombre;
	}

	void setEdad(int e) {
		if (e >= 0) {
			this.edad = e;
		} else {
			System.err.println("EDAD no válida");
		}
	}

	int getEdad() {
		return edad;
	}

}
