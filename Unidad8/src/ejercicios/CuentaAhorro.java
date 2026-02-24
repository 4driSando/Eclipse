package ejercicios;

public class CuentaAhorro extends CuentaBancaria {

	private int saldoMinimo = 400;
	
	public CuentaAhorro(String iban, int saldo, int interesAnuel) {
		super(iban, saldo, interesAnuel);
	}

	@Override
	public double calcularInteres() {
	    double saldo = getSaldo();
	    double interes;
	    if (saldo > saldoMinimo) {
	        interes = saldo + saldo * (getInteresAnuel() * 2 / 100.0);
	    } else {
	        interes = saldo + saldo * (getInteresAnuel() / 2 / 100.0);
	    }
	    return interes;
	}

	public int getSaldoMinimo() {
		return saldoMinimo;
	}

	
}
