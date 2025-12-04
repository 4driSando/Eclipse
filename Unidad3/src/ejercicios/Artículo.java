package ejercicios;

public class Artículo {

	private String nombre;
	private int precio, stock;
	private final double iva = 1.21;

	public Artículo(String n, int p, int s) {
		this.setStock(s);
		this.setPrecio(p);
		this.setNombre(n);
	}

	void setNombre(String n) {
		if (nombre != null && nombre.length() <= 0) {
			System.err.println("NOMBRE DE ARTÍCULO no válido");
		}
		nombre = n;
	}

	String getNombre() {
		return nombre;
	}

	double getIva() {
		return iva;
	}

	void setPrecio(int p) {
		if (p <= 0) {
			System.err.println("PRECIO inválido");
		}
		precio = p;
	}

	int getPrecio() {
		return precio;
	}

	void setStock(int s) {
		if (s <= 0) {
			System.err.println("No queda STOCK");
		}
		stock = s;
	}

	int getStock() {
		return stock;
	}
}
