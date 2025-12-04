package ejercicios;

import java.util.Scanner;

public class MovilMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creamos un móvil por defecto
        Movil m1 = new Movil("666777888", Movil.tipoTarifa.Gato);

        int opcion, t, segs;

        System.out.println("Tarifa por defecto: gato");
        do {
            System.out.println("----------------------");
            System.out.println("MENÚ");
            System.out.println("1. Llamar");
            System.out.println("2. Cambiar Tarifa");
            System.out.println("3. Ver consumo");
            System.out.println("4. Ver resumen factura");
            System.out.println("5. Reiniciar factura");
            System.out.println("6. Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Introduce duración de la llamada (en segundos): ");
                segs = sc.nextInt();
                m1.llamar(segs);
                System.out.println("Llamada realizada.");
            }

            if (opcion == 2) {
                System.out.println("------------");
                System.out.println("ELIGE TARIFA");
                System.out.println("1. Elefante");
                System.out.println("2. Tigre");
                System.out.println("3. Gato");
                t = sc.nextInt();

                if (t == 1) {
                    m1.setTarifa(Movil.tipoTarifa.Elefante);
                } else if (t == 2) {
                    m1.setTarifa(Movil.tipoTarifa.Tigre);
                } else if (t == 3) {
                    m1.setTarifa(Movil.tipoTarifa.Gato);
                }

                System.out.println("Tarifa cambiada.");
            }

            if (opcion == 3) {
            	System.out.println("Consumo actual: " + String.format("%.2f", m1.getConsumo()) + " €");
            }

            if (opcion == 4) {
                m1.resumenFactura();
            }

            if (opcion == 5) {
                m1.reiniciarFactura();
                System.out.println("Factura reiniciada.");
            }

        } while (opcion != 6);

        System.out.println("Gracias por confiar en SandoCall!");
    }
}
