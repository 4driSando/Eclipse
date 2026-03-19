package adrian_perez_sandoval_2Trimestre;

public class FiguraAccion extends Producto {

	// Atributo para recoger su estado
	private int estadoValor;

	// Constructor
	public FiguraAccion(String id, String nombre, double precioBase, int estadoValor) throws Exception {
		super(id, nombre, precioBase);
		setEstadoValor(estadoValor);
	}

	// Getter
	public int getEstadoValor() {
		return estadoValor;
	}

	// Setter donde se comprueba que sea entre 1 y 5
	public void setEstadoValor(int estadoValor) throws Exception {
		if (estadoValor <= 5 && estadoValor >= 1) {
			this.estadoValor = estadoValor;
		} else {
			throw new Exception("Estado debe de ser entre 1 y 5");
		}
	}

	// Método abstracto para calcular el precio final de la subasta
	public double precioFinalSubasta() {
		return getPrecioBase() + (estadoValor * 10);
	}

	// toString
	@Override
	public String toString() {
		return "FiguraAccion " + getNombre() + ", Precio Final: " + precioFinalSubasta() + "€";
	}

}
