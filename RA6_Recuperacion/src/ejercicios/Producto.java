package ejercicios;

import java.util.Objects;

public class Producto {

	private String nombre;
	private int cantidad;

	public Producto(String nombre, int cantidad) throws Exception {
		setNombre(nombre);
		setCantidad(cantidad);
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setNombre(String nombre) {
	    if (nombre == null || nombre.isBlank()) {
	        throw new IllegalArgumentException("Nombre no válido");
	    } else {
	        this.nombre = nombre;
	    }
	}

	public void setCantidad(int cantidad) throws Exception {

		if (cantidad < 0) {
			throw new Exception("La cantidad no puede ser menor a 0");
		} else {
			this.cantidad = cantidad;
		}

	}

	@Override
	public String toString() {
		return "Producto " + nombre + ", Cantidad " + cantidad + " unidades";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre.toLowerCase(), other.nombre.toLowerCase());
	}



}
