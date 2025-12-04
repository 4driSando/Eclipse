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

	public void vender() {
		int escogidas;

	}

	public void mostrarEntradas() {
		System.out.println("Quedan " + numEntradas + " entradas");
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
