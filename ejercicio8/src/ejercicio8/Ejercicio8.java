/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadArticulos;
        double precioTotal = 0.0;

        System.out.println("Ingrese la cantidad de artículos que compró: ");
        cantidadArticulos = scanner.nextInt();

        for (int i = 1; i <= cantidadArticulos; i++) {
            System.out.println("Artículo " + i + ":");
            System.out.println("Ingrese el precio del artículo: ");
            double precioArticulo = scanner.nextDouble();

            System.out.println("Ingrese el color de la etiqueta (roja o no roja): ");
             System.out.println("1.Roja");
             System.out.println("2.No roja");
            int colorEtiqueta = scanner.nextInt();

            if (colorEtiqueta==1) {
                precioTotal += precioArticulo * 0.8;
            } else {
                precioTotal += precioArticulo;
            }
        }

        System.out.println("El total a pagar es: $" + precioTotal);
    }

    }
    

