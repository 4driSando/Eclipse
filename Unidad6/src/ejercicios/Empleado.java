package ejercicios;

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
	
	// toString
	@Override
	public String toString() {
		return nombre + " - " + sueldo + "€";
	}
	
}
