package ejercicios;

import java.util.InputMismatchException;

public class Entradas {

	private String nombre;
	private int numEntradas;
	private int precio;

	public Entradas(String nombre, int numEntradas, int precio) throws IllegalArgumentException, ArithmeticException, InputMismatchException {
		this.nombre = nombre;
		this.numEntradas = numEntradas;
		this.precio = precio;
	}

	public double venderEntradas(int cantidad) {
		if (cantidad > numEntradas) {
			System.err.println("No hay suficientes entradas en " + nombre);
			cantidad = 0;
		}else if (cantidad < 0){
			System.err.println("Cantidad no válida compañerete!");
		} else {
			numEntradas -= cantidad;
		}
		return cantidad * precio;
	}

	@Override
	public String toString() {
		return nombre + ": " + numEntradas;
	}

	public void setNombre(String nombre) throws ArithmeticException {
		if (nombre.length() <= 3) {
			throw new IllegalArgumentException("El nombre tiene que tener al menos 3 carácteres");
		} else {
			this.nombre = nombre;
		}
	}

	public void setNumEntradas(int numEntradas)throws ArithmeticException {
		if (numEntradas <= 0) {
			throw new ArithmeticException("El número de entradas no puede ser negativo");
		} else {
			this.numEntradas = numEntradas;
		}
	}

	public void setPrecio(int precio)throws ArithmeticException {
		if (precio <= 0) {
			throw new ArithmeticException("El precio no puede ser negativo");
		} else {
			this.precio = precio;
		}
	}

	public String mostrarPrecio() {
		return nombre + ": " + precio + "€";
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumEntradas() {
		return numEntradas;
	}

	public int getPrecio() {
		return precio;
	}
}
