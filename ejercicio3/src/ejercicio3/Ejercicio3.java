/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cant1 = 0;
        int cant2 = 0;
        int cant3 = 0;
        int cant4 = 0;
        int cant5 = 0;
        int cantpersonas,edad,i;

        double precioAsiento = 100.000;
        double descuento1 = 0.35;
        double descuento2 = 0.25;
        double descuento3 = 0.1;
        double descuento4 = 0.25;
        double descuento5 = 0.35;
        double perdida1, perdida2, perdida3, perdida4, perdida5;

        System.out.println("Ingrese la cantidad de personas que asistirán al teatro: ");
        cantpersonas = scanner.nextInt();

        for (i = 0; i < cantpersonas; i++) {
            System.out.println("Ingrese la edad de la persona " + (i + 1));
            edad = scanner.nextInt();

            if (edad >= 5 && edad <= 14) {
                cant1++;
            } else if (edad >= 15 && edad <= 19) {
                cant2++;
            } else if (edad >= 20 && edad <= 45) {
                cant3++;
            } else if (edad >= 46 && edad <= 65) {
                cant4++;
            } else if (edad >= 66) {
                cant5++;
            }
        }

        System.out.println("Cantidad de personas en la categoría 1 (5 - 14 años): " + cant1);
        System.out.println("Cantidad de personas en la categoría 2 (15 - 19 años): " + cant2);
        System.out.println("Cantidad de personas en la categoría 3 (20 - 45 años): " + cant3);
        System.out.println("Cantidad de personas en la categoría 4 (46 - 65 años): " + cant4);
        System.out.println("Cantidad de personas en la categoría 5 (66 años en adelante): " + cant5);

        perdida1 = cant1 * precioAsiento * descuento1;
        perdida2 = cant2 * precioAsiento * descuento2;
        perdida3 = cant3 * precioAsiento * descuento3;
        perdida4 = cant4 * precioAsiento * descuento4;
        perdida5 = cant5 * precioAsiento * descuento5;

        System.out.println("El teatro deja de percibir " + perdida1 + " en la categoría 1");
        System.out.println("El teatro deja de percibir " + perdida2 + " en la categoría 2");
        System.out.println("El teatro deja de percibir " + perdida3 + " en la categoría 3");
        System.out.println("El teatro deja de percibir " + perdida4 + " en la categoría 4");
        System.out.println("El teatro deja de percibir " + perdida5 + " en la categoría 5");
    }
}
