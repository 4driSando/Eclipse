package adrian_perez_sandoval_2Trimestre;

import java.util.Comparator;
import java.util.Objects;

public abstract class Producto implements Comparable<Producto> {

	// Atributos
	private String id;
	private String nombre;
	private double precioBase;

	// Constructor
	public Producto(String id, String nombre, double precioBase) throws Exception {
		setId(id);
		setNombre(nombre);
		setPrecioBase(precioBase);
	}

	// Comparador
	@Override
	public int compareTo(Producto otro) {
		return nombre.compareToIgnoreCase(otro.nombre);
	}

	// Método abstracto
	public abstract double precioFinalSubasta();

	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(id, other.id);
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	// Setters
	public void setNombre(String nombre) throws Exception {
		if (nombre == null || nombre.isEmpty()) {
			throw new Exception("Nombre no puede ser null");
		} else {
			this.nombre = nombre;
		}
	}

	public void setId(String id) throws Exception {
		if (id.matches("[A-Z]{2}[0-9]{3}")) {
			this.id = id;
		} else {
			throw new Exception("Formato de id no válido");
		}
	}

	public void setPrecioBase(double precioBase) throws Exception {
		if (precioBase <= 0) {
			throw new Exception("Precio no puede ser negativo");
		} else {
			this.precioBase = precioBase;
		}
	}

}

// Clase para comparar precio de mayor a menor
class ComparaPorPrecio implements Comparator<Producto> {

	@Override
	public int compare(Producto uno, Producto otro) {
		return Double.compare(otro.precioFinalSubasta(), uno.precioFinalSubasta());
	}

}
