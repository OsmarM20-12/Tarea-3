package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Turnos {
    public static void main(String[] args) {

        Queue<Integer> ColaTurnos = new LinkedList<>();
        int siguienteTurno = 1;

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("--------Menú------- ");
            System.out.println("1. Agregar un nuevo cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Mostrar clientes en espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ColaTurnos.add(siguienteTurno);
                    System.out.println("Bienvenido! Se le ha asignado el turno " + siguienteTurno);
                    siguienteTurno++;
                    break;
                case 2:
                    if (ColaTurnos.isEmpty()) {
                        System.out.println("No hay clientes en espera en este momento.");
                    } else {
                        int turnoAtendido = ColaTurnos.poll();
                        System.out.println("Ahora atendiendo al cliente con turno " + turnoAtendido);
                    }
                    break;
                case 3:
                    if (ColaTurnos.isEmpty()) {
                        System.out.println("No hay turnos en espera.");
                    } else {
                        System.out.println("Clientes en espera: " + ColaTurnos);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}