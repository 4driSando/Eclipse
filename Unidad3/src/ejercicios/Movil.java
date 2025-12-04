package ejercicios;

public class Movil {

    private String numero;
    private tipoTarifa tarifa;
    private double consumo;

    enum tipoTarifa {
        Elefante, Tigre, Gato
    }

    // Constructor
    Movil(String n, tipoTarifa t) {
        this.numero = n;
        this.tarifa = t;
        this.consumo = 0;
    }

    // Cambiar tarifa
    void setTarifa(tipoTarifa t) {
        this.tarifa = t;
    }

    // Devuelve el precio/minuto según la tarifa
    private double getPrecioTarifa() {
        double precio = 0;

        if (tarifa == tipoTarifa.Elefante) {
            precio = 0.30;
        } else if (tarifa == tipoTarifa.Tigre) {
            precio = 0.18;
        } else if (tarifa == tipoTarifa.Gato) {
            precio = 0.07;
        }
        return precio;
    }

    // Llamar (duración en segundos)
    void llamar(int segundos) {
        double minutos = segundos / 60.0;
        consumo += minutos * getPrecioTarifa();
    }

    // Reiniciar factura
    void reiniciarFactura() {
        consumo = 0;
    }

    // Resumen factura
    void resumenFactura() {
        System.out.println("-------------");
        System.out.println("Número: " + numero);
        System.out.println("Tarifa: " + tarifa);
        System.out.println("Consumo total: " + String.format("%.2f", consumo) + " €");
    }

    public String getNumero() {
        return numero;
    }

    public double getConsumo() {
        return consumo;
    }
}
