package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la lista de números: ");
        String input = scanner.nextLine();
        String[] numeros = input.split(" ");
        int[] lista = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            lista[i] = Integer.parseInt(numeros[i]);
        }
        Arrays.sort(lista);

        System.out.print("Ingrese el número a buscar: ");
        int buscado = scanner.nextInt();

        int resultado = busquedar(lista, buscado);

        if (resultado != -1) {
            System.out.println("Buscar: " + buscado + " -> " + " Output: " + resultado);
        } else {
            System.out.println("Buscar: " + buscado + " -> " + " Output: -1");
        }

        scanner.close();
    }
    public static int busquedar(int[] lista, int objetivo) {
        int Primer = 0;
        int Segun = lista.length - 1;

        while (Primer <= Segun) {
            int medio = Primer + (Segun - Primer) / 2;

            if (lista[medio] == objetivo) {
                return medio;
            } else if (lista[medio] < objetivo) {
                Primer = medio + 1;
            } else {
                Segun = medio - 1;
            }
        }
        return -1;
    }

}
