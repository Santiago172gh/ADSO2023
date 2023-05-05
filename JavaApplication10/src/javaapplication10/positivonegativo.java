/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class positivonegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float num1;
        System.out.println("Ingresa un numero");
        num1 = scan.nextFloat();
        if (num1 == 0) {
            System.out.println("el numero ingresado es 0, eso significa que es un numero neutro");
        } else {
            if (num1 < 0) {
                System.out.println("tu numero es negativo");
            } else {
                System.out.println("tu numero es positivo ");
            }

        }
    }
}
