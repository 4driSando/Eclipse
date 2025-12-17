package ejercicios;

public class Entradas {

	private String nombre;
	private int numEntradas;
	private int precio;

	public Entradas(String nombre, int numEntradas, int precio) {
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
