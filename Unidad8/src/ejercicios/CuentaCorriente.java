package ejercicios;

public class CuentaCorriente extends CuentaBancaria {

	public CuentaCorriente(String iban, int saldo, int interesAnuel) {
		super(iban, saldo, interesAnuel);
	}

	@Override
	public int calcularInteres() {
		int interesCalculado = getSaldo() + (getSaldo() * getInteresAnuel() / 100);
		return interesCalculado;
	}

}
