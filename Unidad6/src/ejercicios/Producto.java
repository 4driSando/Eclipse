package ejercicios;

import java.util.Objects;

public class Producto {

	private String nombre;
	private int cantidad;
	
	// Contructor
	public Producto(String nombre, int cantidad) {
		setNombre(nombre);
		setCantidad(cantidad);
	}
		
	// Método toString
	@Override
	public String toString() {
		return nombre + ": " + cantidad + " unidades";
	}

	// HashCode sobrecargado
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, nombre);
	}
	
	// .equals sobrecargado
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cantidad == other.cantidad && Objects.equals(nombre, other.nombre);
	}
	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
