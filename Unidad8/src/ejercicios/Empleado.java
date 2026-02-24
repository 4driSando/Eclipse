package ejercicios;

public class Empleado {

	private String nombre;
	private int edad;
	private int telefono;
	private String direccion;
	private String dni;
	private double sueldoBruto;

	// Constructor
	public Empleado(String nombre, String dni, double sueldoBruto) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldoBruto = sueldoBruto;
		setEdad(edad);
		setTelefono(telefono);
		setDireccion(direccion);
	}

	// Métodos
	/**
	 * Método que calcula el sueldo neto al mes
	 * @param recibe el sueldo bruto mensual
	 * @return devuelve el sueldo neto mensual ya calculado
	 */
	public double calcularSueldoNeto(double sBruto) {
		double sueldoAnuel = sBruto*12;
		
		if(sueldoAnuel < 12000) {
			sBruto = sBruto - sBruto*0.2;
		} else if (sueldoAnuel > 12000 && sueldoAnuel < 25000) {
			sBruto = sBruto - sBruto*0.3;
		} else if (sueldoAnuel > 25000) {
			sBruto = sBruto - sBruto*0.4;
		}
		return sBruto;
	}

	// toString
	@Override
	public String toString() {
		return "Empleado Morrocotudo\nNombre: " + nombre + "\nEdad: " + edad + " años\nTeléfono: " + telefono
				+ "\nDireccion: " + direccion + "\nDni: " + dni + "\nSueldo Bruto: " + sueldoBruto + " €\nSueldo Neto: " + calcularSueldoNeto(sueldoBruto) + " €";
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getDni() {
		return dni;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

}
