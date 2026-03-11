package ejercicios;

import java.util.Objects;

public class Empleado {

	// Atributos
	private String nombre;
	private double sueldo;

	// Constructor
	public Empleado(String nombre, double sueldo) {
		setNombre(nombre);
		setSueldo(sueldo);
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(nombre.toLowerCase());
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return nombre.equalsIgnoreCase(other.nombre);
	}

	// toString
	@Override
	public String toString() {
		return nombre + " - " + sueldo + "€";
	}

}
