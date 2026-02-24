package ejercicios;

public class CuentaCorriente extends CuentaBancaria {

	public CuentaCorriente(String iban, int saldo, int interesAnuel) {
		super(iban, saldo, interesAnuel);
	}

	@Override
	public double calcularInteres() {
		double interesCalculado = getSaldo() + (getSaldo() * getInteresAnuel() / 100);
		return interesCalculado;
	}

}
