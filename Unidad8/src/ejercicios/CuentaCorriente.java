package ejercicios;

public class CuentaCorriente extends CuentaBancaria {

	public CuentaCorriente(String iban, int saldo) {
		super(iban, saldo);
	}

	@Override
	public double calcularInteres() {
		double interesCalculado = getSaldo() + (getSaldo() * getInteresAnuel() / 100);
		return interesCalculado;
	}
	
	@Override
	public String toString() {
		return "\nCuenta Corriente\nIban: " + iban + "\nSaldo: " + saldo + "€\nInterés: " + INTERESANUEL + "%";
	}

}
