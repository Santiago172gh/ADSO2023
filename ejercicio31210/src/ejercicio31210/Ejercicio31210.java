/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31210;

/**
 *
 * @author santiago
 */
public class Ejercicio31210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        int suma = 0;
        while (suma <= 100) {
            suma = num1 + num2;
            if (suma <= 100) {
                System.out.print(suma + " ");
            }
            num1 = num2;
            num2 = suma;
        }
    }
}

   