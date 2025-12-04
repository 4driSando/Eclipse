package principal;

import java.util.*;

public class Ejercicio32_U02 {

    public static void main(String[] args) {

        int a, b;
        String opcion = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA MORROCOTUDA");

        while (!opcion.equals("salir")) {
            System.out.println("Introduce una operación: (+, -, *, /) o escriba 'salir'");
            opcion = sc.next();

            if (opcion.equals("salir")) {
                System.out.println("Has terminado, gracias por usar mi calculadora morrocotuda!");
            } else {

                System.out.println("Número 1:");
                a = sc.nextInt();
                System.out.println("Número 2:");
                b = sc.nextInt();

                switch (opcion) {
                    case "+":
                        System.out.println("El resultado es: " + (a + b));
                        break;

                    case "-":
                        System.out.println("El resultado es: " + (a - b));
                        break;

                    case "*":
                        System.out.println("El resultado es: " + (a * b));
                        break;

                    case "/":
                        if (b != 0) {
                            System.out.println("El resultado es: " + ((double) a / b));
                        } else {
                            System.out.println("Error: no se puede dividir entre cero.");
                        }
                        break;

                    default:
                        System.out.println("Operación no válida.");
                }
            }
        }
    }
}
