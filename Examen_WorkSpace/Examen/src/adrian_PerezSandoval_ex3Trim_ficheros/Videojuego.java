package adrian_PerezSandoval_ex3Trim_ficheros;

import java.io.Serializable;

// Clase videojuego
public class Videojuego implements Serializable{

	// Atributos
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String plataforma;
	private double precio;
	
	// Constructor
	public Videojuego(String nombre, String plataforma, double precio) {
		setNombre(nombre);
		setPlataforma(plataforma);
		setPrecio(precio);
	}
			
	// toString
	@Override
	public String toString() {
		return "JUEGO: " + nombre + ", " + plataforma + " -> PRECIO: " + precio + "€";
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
