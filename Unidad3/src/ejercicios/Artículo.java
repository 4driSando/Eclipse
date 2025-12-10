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

	public void añadirStock(int añadir) {
		if (añadir > 0) {
			stock += añadir;
			System.out.println("Se han añadido " + añadir + " artículos del producto " + nombre);
		} else {
			System.err.println("No se pueden añadir negativos");
		}
	}
	
	public double venderArtículo(int cantidad) {
		if (cantidad > stock) {
			System.out.println("No hay suficientes artículos ("+nombre+")");
			cantidad = 0;
		}else if (cantidad < 0){
			System.err.println("Cantidad no válida compañerete!");
		} else {
			stock -= cantidad;
		}
		return cantidad * precio;
	}
	
	public void mostrarListaStock() {
		System.out.println(nombre + " / " + stock + " unidades");
	}
	
	public void mostrarListaPrecio() {
		System.out.println(nombre + " / " + precio + "€");
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
