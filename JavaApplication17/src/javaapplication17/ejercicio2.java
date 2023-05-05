package javaapplication17;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        int respuesta;
        int precio;
        double subtotal;
        int cantidad;

        do {
            System.out.println("Ingresa el precio del artículo: ");
            precio = scanner.nextInt();
            System.out.println("Ingresa la cantidad de artículos iguales que has tomado: ");
            cantidad = scanner.nextInt();

            subtotal = precio * cantidad;

            System.out.println("El subtotal de este artículo es: " + subtotal);

            total += subtotal;

            System.out.println("¿Deseas agregar otro artículo?");
            System.out.println("1.Si");
            System.out.println("2.No");
            respuesta = scanner.nextInt();

        } while (respuesta == 1);

        System.out.println("El total de tus compras es: " + total);
    }
}
