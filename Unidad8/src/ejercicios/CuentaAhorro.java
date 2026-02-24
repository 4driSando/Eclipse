package ejercicios;

public class CuentaAhorro extends CuentaBancaria {

	private int saldoMinimo = 400;
	
	public CuentaAhorro(String iban, int saldo, int interesAnuel) {
		super(iban, saldo, interesAnuel);
	}

	@Override
	public int calcularInteres() {
		int interesCalculado;
		if (getSaldo() > saldoMinimo) {
			interesCalculado = getSaldo() + (getSaldo() * ((getInteresAnuel()*2) / 100));
		} else {
			interesCalculado = getSaldo() + (getSaldo() * ((getInteresAnuel()/2) / 100));
		}
		return interesCalculado;
	}

	public int getSaldoMinimo() {
		return saldoMinimo;
	}

	
}
