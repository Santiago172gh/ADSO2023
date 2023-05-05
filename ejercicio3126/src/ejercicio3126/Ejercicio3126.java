/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3126;

/**
 *
 * @author santiago
 */
     import java.util.Scanner;
public class Ejercicio3126 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        int mcd = calcularMCD(num1, num2);
        
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);
    }
    
    public static int calcularMCD(int num1, int num2) {
        while (num2 != 0) {
            int resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }
        return num1;
    }
}
    
