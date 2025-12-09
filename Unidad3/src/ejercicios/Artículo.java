package ejercicios;

public class Artículo {

	private String nombre;
	private int stock;
	private final double iva = 1.21;
	private double precio;

	public Artículo(String n, double p, int s) {
		this.setStock(s);
		this.setPrecio(p);
		this.setNombre(n);
	}

	public void mostrarProducto() {
	    System.out.println("Nombre: " + nombre + ", Precio: " + precio + "€, Stock: " + stock);
	}
	
	void setNombre(String n) {
		this.nombre = n;
	}

	String getNombre() {
		return nombre;
	}

	double getIva() {
		return iva;
	}

	void setPrecio(double d) {
		this.precio = d;
	}

	double getPrecio() {
		return precio;
	}

	void setStock(int s) {
		this.stock = s;
	}

	int getStock() {
		return stock;
	}
}
