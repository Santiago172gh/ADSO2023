/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3127;

/**
 *
 * @author santiago
 */
import java.util.Scanner;
public class Ejercicio3127 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        int mcm = calcularMCM(num1, num2);
        
        System.out.println("El mínimo común múltiplo de " + num1 + " y " + num2 + " es: " + mcm);
    }
    
    public static int calcularMCM(int num1, int num2) {
        int maximoComunDivisor = calcularMCD(num1, num2);
        int mcm = (num1 * num2) / maximoComunDivisor;
        return mcm;
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
    
