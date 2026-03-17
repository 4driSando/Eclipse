package ejercicios;

import java.util.Objects;

public class Persona2 implements Comparable<Persona2> {
	private String nombre;
	private int edad;

	public Persona2(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona2() {

	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public int hashCode() {
		System.out.println("Nombre: " + nombre + "--> " + Objects.hash(edad, nombre));
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Persona2 p2 = null;
		if (obj instanceof Persona2) {
			p2 = (Persona2) obj;

		} else {
			return result;
		}
		if ((this.getNombre().equals(p2.getNombre())) && (this.getEdad() == p2.getEdad())) {
			result = true;
		}
		return result;
	}

	// Cuando una clase implementa comparable, es obligatorio implementar el
	// compareTo, este determinará el orden natural en el que se deben ordenar los
	// objetos de una clase, que siempre ser� decisi�n de aquel que implementa dicha clase
	@Override
	public int compareTo(Persona2 o) {
		int variable = -1;
		Persona2 p2 = null;
		if (o instanceof Persona2) {
			p2 = (Persona2) o;
		} else {
			return variable;
		}
		// Importante que devuelva cero con las mismas condiciones que el equal
		if (this.equals(p2)) {
			variable = 0;
		} else if (this.getEdad() > p2.getEdad()) {
			variable = 1;
		} else {
			variable = -1;
		}
		return variable;
	}
	@Override
	public String toString() {
		return this.getNombre() + " - " + this.getEdad();
	}

}


