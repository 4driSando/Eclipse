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
	
	public String toString() {
		return getNombre() + " - " + "Precio:" + getPrecio() + "€ - IVA: 21% - PVP:"
				+ getPrecio() * getIva() + "€";
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
			System.err.println("No hay suficientes artículos ("+nombre+")");
			cantidad = 0;
		}else if (cantidad < 0){
			System.err.println("Cantidad no válida compañerete!");
		} else {
			stock -= cantidad;
		}
		return cantidad * precio;
	}
	
	public String mostrarListaStock() {
		return nombre + " / " + stock + " unidades";
	}
	
	public String mostrarListaPrecio() {
		return nombre + " / " + precio + "€";
	}
	
	public String mostrarProducto() {
	    return "Nombre: " + nombre + ", Precio: " + precio + "€, Stock: " + stock;
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
