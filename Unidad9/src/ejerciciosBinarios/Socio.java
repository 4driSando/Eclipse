package ejerciciosBinarios;

import java.io.Serializable;

public class Socio implements Serializable {

	private static final long serialVersionUID = 1L;
	private String dni;
	private String nombre;

	public Socio(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Socio{" + "dni=" + dni + ", nombre=" + nombre + '}';
	}
}