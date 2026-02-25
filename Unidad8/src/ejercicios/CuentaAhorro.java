package ejercicios;

public class CuentaAhorro extends CuentaBancaria {

	private int saldoMinimo = 400;
	
	public CuentaAhorro(String iban, int saldo) {
		super(iban, saldo);
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
	
	@Override
	public String toString() {
		return "\nCuenta Ahorro\nIban: " + iban + "\nSaldo: " + saldo + "€\nInterés: " + INTERESANUEL + "%";
	}

	public int getSaldoMinimo() {
		return saldoMinimo;
	}

	
}
