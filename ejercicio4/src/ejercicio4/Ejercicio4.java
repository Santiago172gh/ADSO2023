/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class Ejercicio4 {
  
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String respuesta;
        double masa = 0;
        int n = 0; // Contador de vehículos

        System.out.println("¿Cuántos vehículos hay en compostura?");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("¿Qué vehículo es? (carro/motocicleta)");
            respuesta = teclado.next();
            do {
                switch (respuesta) {
                    case "carro":
                        System.out.println("Ingrese la presión:");
                        double presion = teclado.nextDouble();
                        System.out.println("Ingrese el volumen:");
                        double volumen = teclado.nextDouble();
                        System.out.println("Ingrese la temperatura:");
                        double temperatura = teclado.nextDouble();
                        masa += (presion * volumen) / (temperatura + 460);
                        break;
                    case "motocicleta":
                        System.out.println("Ingrese la presión:");
                        presion = teclado.nextDouble();
                        System.out.println("Ingrese el volumen:");
                        volumen = teclado.nextDouble();
                        System.out.println("Ingrese la temperatura:");
                        temperatura = teclado.nextDouble();
                        masa += (presion * volumen) / (temperatura + 460);
                        break;
                    default:
                        System.out.println("Vehículo no válido.");
                        i--; // Restar 1 al contador para no contabilizar el vehículo no válido
                        break;
                }
                System.out.println("El promedio de masa de aire de los vehículos es: " + (masa / n));
                teclado.nextLine();
                System.out.println("¿Desea continuar comprando? (s/n)");
            } while (teclado.nextLine().equalsIgnoreCase("s"));
        }

        teclado.close();
    }
}

