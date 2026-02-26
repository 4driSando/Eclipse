package ejercicios;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private String cif;
	private int telefono;
	private String direccion;
	private ArrayList<Empleado> empleados;

	// Constructor
	public Empresa(String nombre, String cif) {
		this.nombre = nombre;
		this.cif = cif;
		setTelefono(telefono);
		setDireccion(direccion);
		this.empleados = new ArrayList<Empleado>();
	}

	// Métodos
	/**
	 * Meétodo para añadir empleado
	 * @param empleado para añadir
	 */
	public void anadirEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	/**
	 * Método para eliminar empleado
	 * @param empleado a eliminar
	 */
	public void eliminarEmpleado(Empleado empleado) {
		empleados.remove(empleado);
	}

	/**
	 * Método que muestra un listado con los nombres de los empleados
	 */
	public void mostrarNombresEmpleados() {
		int contador = 1;
		System.out.println("\nLISTA DE EMPLEADOS");
		for (Empleado empleado : empleados) {
			System.out.println(contador + ". " + empleado.getNombre());
			contador++;
		}
	}

	/**
	 * Método que muestra un listado de los empleados con toda su información
	 */
	public void mostrarTodaInfoEmpleados() {
		int contador = 1;
		System.out.println("\nLISTA DE EMPLEADOS");
		for (Empleado empleado : empleados) {
			System.out.println(contador + ". " + empleado + "\n");
			contador++;
		}
	}

	/**
	 * Método que muestra un listado de los empleados de solamente su nombre, DNI, Sueldo Bruto y Sueldo Neto
	 */
	public void mostrarDNISbSnEmpleados() {
		int contador = 1;
		System.out.println("\nLISTA DE EMPLEADOS");
		for (Empleado empleado : empleados) {
			System.out.println(contador + ". " + empleado.getNombre() + "\nDNI: " + empleado.getDni()
					+ "\nSueldo Bruto: " + empleado.getSueldoBruto() + "\nSueldo Neto: "
					+ empleado.calcularSueldoNeto(empleado.getSueldoBruto()) + "\n");
			contador++;
		}
	}
	
	/**
	 * Método que devuelve el dinero que gasta la empresa al mes en sueldos brutos
	 * @return devuelve el total de sueldos brutos
	 */
	public double calcularTotalMensualBruto() {
		double sueldoTotal = 0;
		for (Empleado empleado : empleados) {
			sueldoTotal = sueldoTotal + empleado.getSueldoBruto();
		}
		return sueldoTotal;
	}
	
	/**
	 * Método que devuelve el dinero que gasta la empresa al mes en sueldos netos
	 * @return devuelve el total de sueldos netos
	 */
	public double calcularTotalMensualNeto() {
		double sueldoTotal = 0;
		for (Empleado empleado : empleados) {
			sueldoTotal = sueldoTotal + empleado.calcularSueldoNeto(empleado.getSueldoBruto());
		}
		return sueldoTotal;
	}
	
	// toString

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public String getCif() {
		return cif;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
