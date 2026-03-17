package ejerciciorepaso2;

public abstract class Animal {

	protected String idChip;
	protected String nombre;
	protected double presupuestoBase;
	protected Cuidador cuidador;
	
	// Constructor
	public Animal(String idChip, String nombre, double presupuestoBase, Cuidador cuidador) {
		this.idChip = idChip;
		this.nombre = nombre;
		this.presupuestoBase = presupuestoBase;
		this.cuidador = cuidador;
	}
	// Getters
	public String getIdChip() {
		return idChip;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPresupuestoBase() {
		return presupuestoBase;
	}
	public Cuidador getCuidador() {
		return cuidador;
	}
	
	// Setters
	public void setIdChip(String idChip) throws Exception {
		if (idChip == null || idChip.isEmpty()) {
			throw new Exception("idChip no puede ser null ni vacío");
		} else {
			this.idChip = idChip;			
		}
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPresupuestoBase(double presupuestoBase) {
		this.presupuestoBase = presupuestoBase;
	}
	public void setCuidador(Cuidador cuidador) {
		this.cuidador = cuidador;
	}
	
	
}
