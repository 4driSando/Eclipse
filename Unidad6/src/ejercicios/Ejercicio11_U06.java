package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11_U06 {

    public static void main(String[] args) {

        HashMap<String, String> users = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Usuarios Morrocotudos");
            System.out.println("--------------------------");
            System.out.println("1. Mostrar usuarios");
            System.out.println("2. Agregar usuario");
            System.out.println("3. Entrar al área restringida");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (users.isEmpty()) {
                        System.out.println("No existen usuarios");
                    } else {
                        for (String user : users.keySet()) {
                            System.out.println("Usuario: " + user);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Nombre de usuario: ");
                    String usuario = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String password = sc.nextLine();
                    users.put(usuario, password);
                    System.out.println("Usuario añadido correctamente");
                    break;

                case 3:
                    int intentos = 3;
                    boolean acceso = false;

                    while (intentos > 0 && !acceso) {
                        System.out.print("Usuario: ");
                        usuario = sc.nextLine();
                        System.out.print("Contraseña: ");
                        password = sc.nextLine();

                        if (users.containsKey(usuario) &&
                            users.get(usuario).equals(password)) {

                            System.out.println("Ha accedido al área restringida");
                            acceso = true;

                        } else {
                            intentos--;
                            System.err.println("Usuario y/o contraseña incorrectos. Intentos restantes: " + intentos);
                        }
                    }

                    if (!acceso) {
                        System.err.println("Lo siento, no tiene acceso al área restringida");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar la gestión de control de usuarios morrocotudos");
                    break;

                default:
                    System.err.println("Opción no válida, compañerete");
            }

        } while (opcion != 4);

        sc.close();
    }
}
