package adrian_perez_sandoval_2Trimestre;

public class Comic extends Producto {

	// Atributo con el que comprobar si es first edition
	private boolean firstEdition;

	// Constructor
	public Comic(String id, String nombre, double precioBase, boolean firstEdition) throws Exception {
		super(id, nombre, precioBase);
		this.firstEdition = firstEdition;
	}

	// Getter y Setter
	public boolean isFirstEdition() {
		return firstEdition;
	}

	public void setFirstEdition(boolean firstEdition) {
		this.firstEdition = firstEdition;
	}

	// Método abstracto para calcular el precio final de la subasta
	public double precioFinalSubasta() {
		double precioFinal;

		if (firstEdition == true) {
			precioFinal = getPrecioBase() * 1.15;
		} else {
			precioFinal = getPrecioBase();
		}

		return precioFinal;
	}

	// toString
	@Override
	public String toString() {
		return "Cómic " + getNombre() + ", Precio Final: " + precioFinalSubasta() + "€";
	}

}
