package ejercicios;

public abstract class CuentaBancaria {

	private String iban;
	private int saldo;
	private int interesAnuel = 20;

	// Constructor
	public CuentaBancaria(String iban, int saldo, int interesAnuel) {
		setIban(iban);
		setSaldo(saldo);
		this.interesAnuel = 20;
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

	@Override
	public String toString() {
		return "CuentaBancaria [Iban=" + iban + ", Saldo=" + saldo + ", Interés=" + interesAnuel;
	}

	// Getters & setters
	public String getIban() {
		return iban;
	}

	public int getSaldo() {
		return saldo;
	}

	public int getInteresAnuel() {
		return interesAnuel;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
