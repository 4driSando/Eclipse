package cuentas;

/**
 * Clase de cuenta
 * @author Sandoval
 * @version 1.0
 */
public class Cuenta {

	// Atributos
	
	// String con el nombre del titular
	protected String nombre;
	
	// String con el id de la cuenta
	private String cuenta;
	
	// double del saldo con su cantidad
	private double saldo;
	
	// double con el tipo de interés de la cuenta
	private double tipoInteres;

	/**
	 * Constructor por defecto
	 */
	public Cuenta() {
	}

	/**
	 * Constructor de la clase cuenta con parámetros
	 * @param nom nombre del titular
	 * @param cue id de la cuenta
	 * @param sal saldo que tiene la cuenta
	 * @param tipo tipo de interés que tiene
	 */
	public Cuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}

	/**
	 * Método para cambiar el nombre del titular
	 * @param nom nombre a poner
	 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	/**
	 * Método para obtener el nombre
	 * @return el nombre del titular
	 */
	public String obtenerNombre() {
		return nombre;
	}

	/**
	 * Método para ingresar dinero a la cuenta
	 * @param cantidad a ingresar que se le suma al saldo
	 * @throws Exception si la cantidad a ingresar es negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * Método para retirar dinero a la cuenta
	 * @param cantidad que se le resta al saldo
	 * @throws Exception si la cantidad a ingresar es negativa
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (saldo < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	/**
	 * Método que devuelve el iban de la cuenta
	 * @return devuelve el atributo cuenta
	 */
	public String obtenerCuenta() {
		return cuenta;
	}

	/**
	 * Setter de cuenta
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Setter de saldo
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Getter de saldo
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Getter de tipoDeInteres
	 * @return
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Setter de tipoDeInteres
	 * @param tipoInteres
	 */
	public void setTipoInteress(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
