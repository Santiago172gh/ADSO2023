/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Ambiente 209-1
 */
   import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nobreros;
        double horas, salario, horasExtras, salarioSemanal;
        System.out.print("Ingrese el número de obreros: ");
        nobreros = scanner.nextInt();

        for (int i = 1; i <= nobreros; i++) {
            System.out.println("Obrero " + i + ": ");
            System.out.println("Ingrese las horas trabajadas en la semana: ");
            horas = scanner.nextDouble();
            System.out.println("Ingrese el salario por hora: ");
            salario = scanner.nextDouble();

            if (horas <= 40) {
                salarioSemanal = horas * salario;
            } else if (horas <= 48) {
                horasExtras = horas - 40;
                salarioSemanal = 40 * salario + horasExtras * salario * 2;
            } else {
                horasExtras = horas - 48;
                salarioSemanal = 40 * salario + 8 * salario * 2 + horasExtras * salario * 3;
            }
            System.out.println("El salario semanal del obrero " + i + " es: $" + salarioSemanal);
        }
    }
}
