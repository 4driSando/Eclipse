package ejercicios;

import java.time.LocalDate;

public class Mascota {

	private String nombre;
	private LocalDate fechaNac;

	public Mascota(String nombre, LocalDate fechaNac) {
		this.setNombre(nombre);
		this.setFechaNac(fechaNac);
	}

	@Override
	public String toString() {
		return nombre + ", nació el " + fechaNac + ". Info: ";
	}

	public String sonidoCaracteristico() {
		return getNombre() + " ha dicho ";
	}
	
	public String getNombre() throws ArithmeticException {
		return nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			throw new ArithmeticException("Nombre no puede ser null");
		} else {
			this.nombre = nombre;
		}
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

}
