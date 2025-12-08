package ejercicios;

public class Entradas {

    private String nombre;
    private int numEntradas;
    private int precio;

    public Entradas(String nombre, int numEntradas, int precio) {
        this.nombre = nombre;
        this.numEntradas = numEntradas;
        this.precio = precio;
    }

    public double venderEntradas(int cantidad) {
        if (cantidad > numEntradas) {
            System.out.println("No hay suficientes entradas en " + nombre);
            cantidad = 0;
        } else {
            numEntradas -= cantidad;
        }
        return cantidad * precio;
    }


    public void mostrarEntradas() {
        System.out.println("Quedan " + numEntradas + " entradas en " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumEntradas() {
        return numEntradas;
    }

    public int getPrecio() {
        return precio;
    }
}
