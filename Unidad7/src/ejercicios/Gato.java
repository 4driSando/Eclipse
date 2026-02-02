 package ejercicios;

public class Gato {

	private String nombre;
	private int edad;

	public Gato(String nombre, int edad) throws IllegalArgumentException, ArithmeticException {
		setNombre(nombre);
		setEdad(edad);
	}

	@Override
	public String toString() {
		return "Gato " + nombre + ", " + edad + " años";
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setNombre(String nombre) throws ArithmeticException {
		if (nombre.length() <= 3) {
			throw new IllegalArgumentException("El nombre tiene que tener al menos 3 carácteres");
		} else {
			this.nombre = nombre;
		}
	}

	public void setEdad(int edad) throws ArithmeticException {
		if (edad <= 0) {
			throw new ArithmeticException("La edad no puede ser negativa");
		} else {
			this.edad = edad;
		}
	}

}
