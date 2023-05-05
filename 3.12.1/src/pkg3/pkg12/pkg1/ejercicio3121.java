/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg1;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class ejercicio3121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n = scanner.nextInt();

        int sumatoria = 0;
        for (int i = 1; i <= n; i++) {
            sumatoria += i;
        }

        System.out.println("La sumatoria de 1 hasta " + n + " es: " + sumatoria);
    }
}

