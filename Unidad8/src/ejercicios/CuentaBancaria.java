package ejercicios;

public abstract class CuentaBancaria {

	protected String iban;
	protected int saldo;
	protected static final int INTERESANUEL = 20;

	// Constructor
	public CuentaBancaria(String iban, int saldo) {
		setIban(iban);
		setSaldo(saldo);
	}

	// Métodos
	public int ingresarDinero(int dinero) {
		setSaldo(saldo + dinero);
		return saldo;
	}

	public int retirarDinero(int dinero) {
		setSaldo(saldo - dinero);
		return saldo;
	}

	public int traspasarDinero(int dinero, CuentaBancaria bancaria) {
		setSaldo(saldo - dinero);
		bancaria.setSaldo(bancaria.getSaldo() + dinero);
		return saldo;
	}

	public abstract double calcularInteres();

	// Getters & setters
	public String getIban() {
		return iban;
	}

	public int getSaldo() {
		return saldo;
	}

	public int getInteresAnuel() {
		return INTERESANUEL;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
