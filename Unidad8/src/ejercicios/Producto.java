package ejercicios;

import java.time.LocalDate;

public class Producto {

	// Atributos
	protected String nombre;
	protected LocalDate fechaCad;
	protected int numLote;
	protected LocalDate fechaEnvasado;

	// Constructor
	public Producto(String nombre, LocalDate fechaCad, int numLote, LocalDate fechaEnvasado) throws Exception {
		setNombre(nombre);
		setFechaCad(fechaCad);
		setNumLote(numLote);
		setFechaEnvasado(fechaEnvasado);
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) throws Exception {
		if (nombre.equals("") || nombre.equals(null)) {
			throw new Exception("Nombre no puede ser null");
		} else {
			this.nombre = nombre;
		}
	}

	public LocalDate getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(LocalDate fechaCad) throws Exception {
		if (fechaCad.equals("") || fechaCad.equals(null)) {
			throw new Exception("Fecha de caducidad no puede ser null");
		} else {
			this.fechaCad = fechaCad;
		}
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) throws Exception {
		if (numLote <= 0) {
			throw new Exception("Número de lote tiene que ser mayor que 0");
		} else {
			this.numLote = numLote;
		}
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) throws Exception {
		if (fechaEnvasado.equals("") || fechaEnvasado.equals(null)) {
			throw new Exception("Fecha de envasado no puede ser null");
		} else {
			this.fechaEnvasado = fechaEnvasado;
		}
	}

}
