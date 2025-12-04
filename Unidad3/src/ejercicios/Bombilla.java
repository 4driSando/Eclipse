package ejercicios;

public class Bombilla {

    private boolean estado = false;
    private static boolean interruptorGeneral = true;

    /**
     * Función para encender cualquier bombilla
     * */   
    public void encender() {
        estado = true;
    }

    /**
     * Función para apagar cualquier bombilla
     * */
    public void apagar() {
        estado = false;
    }

    /**
     * Función para apagar el general
     * */
    public static void apagarGeneral() {
        interruptorGeneral = false;
    }

    /**
     * Función para encender general
     * */
    public static void encenderGeneral() {
        interruptorGeneral = true;
    }

    /**
     * Función para saber si una bombilla está encencida. Solo es 'true' cuando
     * estado y el interruptorGeneral son true, cualquier otra cosa será false
     * */
    public boolean estaEncendida() {
        return estado && interruptorGeneral;
    }
}